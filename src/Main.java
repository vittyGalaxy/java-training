import section14.ClientClass;
import section14.ClientNotSyncClass;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClientClass c1 = new ClientClass("Vittorio", 20);
        ClientClass c2 = new ClientClass("Angelo", 50);

        // start
        c1.start();
        c2.start();

        c1.join();
        c2.join();


        ClientNotSyncClass c3 = new ClientNotSyncClass("Vittorione", 20);
        ClientNotSyncClass c4 = new ClientNotSyncClass("Abgelone", 50);

        // start
        c3.start();
        c4.start();

        c3.join();
        c4.join();
    }
}