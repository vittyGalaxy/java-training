import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import section14.GetSitePageClass;
import section14.TryCatchFinallyClass;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(new GetSitePageClass("http://www.getsitepage.it"));
        pool.execute(new GetSitePageClass("http://www.google.it"));
        pool.execute(new GetSitePageClass("http://www.amazon.it"));

        ExecutorService threadpool = Executors.newCachedThreadPool();

        threadpool.execute(new GetSitePageClass("http://www.getsitepage.it"));
        threadpool.execute(new GetSitePageClass("http://www.google.it"));

        threadpool.shutdown();
    }
}