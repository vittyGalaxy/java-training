package section14;

import java.util.List;

public class ConsumerClass implements Runnable {
    private final List<Integer> sharedBuffer;

    public ConsumerClass(List<Integer> sharedBuffer, int size) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("The Consumer thread is reading the buffer...");
                consume();
                Thread.sleep(1000);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        while (this.sharedBuffer.isEmpty()) {
            synchronized (this.sharedBuffer) {
                System.out.println("The buffer is empty, the Consumer thread is waiting... the buffer size is now: " + this.sharedBuffer.size());

                this.sharedBuffer.wait();
            }
        }

        synchronized (this.sharedBuffer) {
            System.out.println("The Consumer thread is reading the buffer and deleting the following item: " + this.sharedBuffer.remove(0) + " the buffer size is now:" + this.sharedBuffer.size());

            this.sharedBuffer.notifyAll();
        }
    }
}
