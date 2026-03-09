package section14;

public class TryCatchFinallyClass extends Thread {
    private long sleep;

    public TryCatchFinallyClass(long sleep) {
        super();
        this.sleep = sleep;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Entered the finally");
        }
    }
}
