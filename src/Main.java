import java.util.ArrayList;
import java.util.List;

import section10.Apartment;
import section11.HashMapClass;
import section11.IterationClass;

public class Main {

    public static void main(String[] args){
        List l1 = new ArrayList();
        l1.add("1");
        l1.add("2");
        l1.add(new Apartment());

        String test1 = (String)l1.get(0);

        List<String> l2 = new ArrayList<String>();
        l2.add("3");
        l2.add("4");

        String test2 = l2.get(0);
    }
}
