package section14;

import java.util.concurrent.locks.ReentrantLock;

public class CounterClass extends Thread {
    private ReentrantLockClass counter;
    private int limit;
    private int sleep;

    public CounterClass(ReentrantLockClass counter, int limit, int sleep) {
        super();
        this.counter = counter;
        this.limit = limit;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        while (this.counter.matters() < limit){
            try {
                this.counter.sum();
                Thread.sleep(this.sleep);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
