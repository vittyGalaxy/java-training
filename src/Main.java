import section14.CounterClass;
import section14.ReentrantLockClass;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLockClass counter = new ReentrantLockClass();

        CounterClass cc1 = new CounterClass(counter, 10, 50);
        CounterClass cc2 = new CounterClass(counter, 10, 50);

        // start
        cc1.start();
        cc2.start();
    }
}