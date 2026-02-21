package section11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationClass {
    public void exampleIteration(){
        List<String> l = new ArrayList<String>();
        l.add("Paolo");
        l.add("Mario");
        l.add("Chiara");
        l.add("Marta");

        // for
        for(int i = 0; i < l.size(); i++){
            String name = l.get(i);
            System.out.println(name);
        }
        
        System.out.println("-------------------------------");

        // for each
        for(String name : l){
            System.out.println(name);
        }

        System.out.println("-------------------------------");

        // iterator
        Iterator<String> i = l.iterator();

        while(i.hasNext()){
            String name = i.next();

            System.out.println(name);
        }
    }
}
