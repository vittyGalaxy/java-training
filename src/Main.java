import section14.RunnableClass;
import section14.ThreadClass;

public class Main {

    public static void main(String[] args){
        ThreadClass tc = new ThreadClass();
        tc.start();

        Thread t = new Thread(new RunnableClass());
        t.start();
    }
}
