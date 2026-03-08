package section14;

import java.util.List;

public class ProducerClass implements Runnable {
    private final List<Integer> sharedBuffer;
    private final int size;
    private int i;

    public ProducerClass(List<Integer> sharedBuffer, int size) {
        this.sharedBuffer = sharedBuffer;
        this.size = size;
        this.i = 1;
    }

    @Override
    public void run() {
        while (true) {
            try {
                produce();
                this.i++;
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void produce() throws InterruptedException {
        while (this.sharedBuffer.size() == this.size) {
            synchronized (this.sharedBuffer) {
                System.out.println("The buffer is full, the Producer thread is waiting... the buffer size is now:" + this.sharedBuffer.size());

                this.sharedBuffer.wait();
            }
        }

        synchronized (this.sharedBuffer) {
            this.sharedBuffer.add(this.i);
            this.sharedBuffer.notifyAll();

            System.out.println("The Producer thread added the following item to the buffer: " + this.i + " the buffer size is now: " + this.sharedBuffer.size());
        }
    }
}
