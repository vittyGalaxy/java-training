import section14.TryCatchFinallyClass;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TryCatchFinallyClass tcf = new TryCatchFinallyClass(10);

        // start
        tcf.start();

        tcf.interrupt();
    }
}