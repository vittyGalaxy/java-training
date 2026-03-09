package section14;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockClass {
    private ReentrantLock lockInstance = new ReentrantLock();
    private int counter = 0;
    private int sum = 0;

    public int matters() {
        System.out.println("The thread " + Thread.currentThread().getName() + " requested to increment the counter");

        this.lockInstance.lock();

        try {
            System.out.println(Thread.currentThread().getName() + " counter = " + this.counter);
            this.counter++;

            return this.counter;
        } finally {
            this.lockInstance.unlock();
        }
    }

    public void sum(){
        System.out.println("The thread " + Thread.currentThread().getName() + " requested to display the sum of the counters");

        if (this.lockInstance.tryLock()){
            try {
                this.sum += this.counter;
                System.out.println(Thread.currentThread().getName() + " the sum is = " + this.sum);
            } finally {
                this.lockInstance.unlock();
            }
        } else{
            System.out.println("******************************** The thread chr hs the lock on the object is: " + Thread.currentThread().getName());
        }
    }
}
