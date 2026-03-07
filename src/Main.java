import section14.RunnableClass;
import section14.ThreadClass;

public class Main {

    public static void main(String[] args){
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
