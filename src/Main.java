import section9.Exceptions;
import section9.ExceptionsTest;

public class Main {

    public static void main(String[] args){
        Exceptions e1 = new Exceptions(null);
        Exceptions e2 = new Exceptions("Hello World!");

        e1.printText();
        e2.printText();

        e1.callPrintText();
        e2.callPrintText();

        try {
            e1.execute();
            e2.execute();
        } catch (ExceptionsTest e) {
            e.printStackTrace();
        }
    }
}
