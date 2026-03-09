import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import section14.Consumer;
import section14.Producer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);

        Thread p = new Thread(new Producer(queue));
        Thread c = new Thread(new Consumer(queue));

        // start
        p.start();
        c.start();
    }
}