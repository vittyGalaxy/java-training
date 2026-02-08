import java.util.ArrayList;
import java.util.Date;

import section7.Client;
import section7.OrderLine;
import section7.SalesOrder;
import section7.Smartphone;
import section7.Television;

public class Main {

    public static void main(String[] args){
        Main m = new Main();

        m.printText(null);
        m.printText("Hello World!");
    }

    private void printText(String text){
        if (text != null){
            String t = text.concat("...");
            System.out.println(t);
        } else{
            System.out.println("null");
        }
    }
}
