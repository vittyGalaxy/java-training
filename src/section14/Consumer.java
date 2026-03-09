package section14;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            if (this.queue.remainingCapacity() > 0) {
                System.out.println("More can be added " + this.queue.remainingCapacity() + " out of " + this.queue.size());
            } else if (this.queue.remainingCapacity() == 0) {
                String itemRemoved = this.queue.remove();
                System.out.println("The element has been removed: " + itemRemoved);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
