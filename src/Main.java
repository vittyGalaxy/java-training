import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

import section14.GetSitePage;
import section14.GetSitePageExecutor;
import section14.GetSitePageForkJoin;
import section14.RunnableClass;
import section14.ThreadClass;

public class Main {

    public static void main(String[] args){
        Main m = new Main();

        try {
            m.exampleThreadConcurrency();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        try {
            m.exampleExecutorCompetition();
        } catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }

        m.exampleConcurrencyForkJoin();
    }

    private void exampleConcurrencyForkJoin(){
        ForkJoinPool f = new ForkJoinPool();
        System.out.println(f.invoke(new GetSitePageForkJoin("http://www.getsitepageforkjoin.it")));
        System.out.println(f.invoke(new GetSitePageForkJoin("http://www.getsitepageforkjoin.it")));

        f.shutdown();
    }

    private void exampleExecutorCompetition() throws InterruptedException, ExecutionException{
        List<Callable<String>> sites = new ArrayList<Callable<String>>();
        sites.add(new GetSitePageExecutor("http://www.getsitepageexecutor.it"));
        sites.add(new GetSitePageExecutor("http://www.google.it"));

        ExecutorService ex = Executors.newSingleThreadExecutor();
        List<Future<String>> out = ex.invokeAll(sites);

        for (Future<String> future : out){
            System.out.println(future.get());
        }

        ex.shutdown();
    }

    private void exampleThreadConcurrency() throws InterruptedException{
        GetSitePage s1 = new GetSitePage("http://www.getsitepage.it");
        GetSitePage s2 = new GetSitePage("http://www.google.it");

        // start
        s1.start();
        s2.start();

        // join
        s1.join();
        s2.join();

        System.out.println("output getsitepage");
        System.out.println(s1.getContent());
        
        System.out.println("output google");
        System.out.println(s2.getContent());
    }

    private void exampleThread(){
        ThreadClass tc1 = new ThreadClass();
        tc1.setName("thread 1");

        ThreadClass tc2 = new ThreadClass();
        tc2.setName("thread 2");

        ThreadClass tc3 = new ThreadClass();
        tc3.setName("thread 3");

        ThreadClass tc4 = new ThreadClass();
        tc4.setName("thread 4");

        ThreadClass tc5 = new ThreadClass();
        tc5.setName("thread 5");

        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();

        Thread t = new Thread(new RunnableClass());
        t.start();
    }
}
