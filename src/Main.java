import java.util.LinkedList;
import java.util.List;

import section14.ConsumerClass;
import section14.ProducerClass;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> sharedBuffer = new LinkedList<Integer>();
        int size = 4;

        Thread pThread = new Thread(new ProducerClass(sharedBuffer, size), "Producer");
        Thread cThread = new Thread(new ConsumerClass(sharedBuffer, size), "Consumer");

        pThread.start();
        cThread.start();
    }
}