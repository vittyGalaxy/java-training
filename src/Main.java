import section9.Exceptions;
import section9.ExceptionsTest;

public class Main {

    public static void main(String[] args) throws ExceptionsTest{
        Exceptions e1 = new Exceptions(null);
        Exceptions e2 = new Exceptions("Hello World!");

        e1.execute();
        e2.execute();
    }
}
