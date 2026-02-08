import section9.Exceptions;

public class Main {

    public static void main(String[] args){
        Exceptions e1 = new Exceptions(null);
        Exceptions e2 = new Exceptions("Hello World!");

        e1.printText();
        e2.printText();

        e1.callPrintText();
        e2.callPrintText();

        e1.printText2();
        e2.printText2();
    }
}
