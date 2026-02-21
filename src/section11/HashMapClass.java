package section11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import section7.Smartphone;

public class HashMapClass {
    public void exampleHashMap(){
        Map<String, Smartphone> map = new HashMap<String, Smartphone>();
        Smartphone sm = new Smartphone();
        sm.setBrand("Apple");
        sm.setModel("iPhone");
        map.put(sm.getModel(), sm);
        
        Smartphone sm2 = new Smartphone();
        sm2.setBrand("Samsung");
        sm2.setModel("Galaxy");
        map.put(sm2.getModel(), sm2);

        Smartphone sm3 = map.get("iPhone");
        System.out.println(sm3.getBrand() + " " + sm3.getModel());

        System.out.println(map.size());
        map.clear();
        System.out.println(map.size());

        map.put(sm.getModel(), sm);
        map.put(sm2.getModel(), sm2);

        Set<String> key = map.keySet();

        System.out.println("-------------------------------");

        // for each
        for(String string : key){
            System.out.println(string);
        }
        
        System.out.println("-------------------------------");

        // iterator
        Iterator<String> i2 = key.iterator();
        while(i2.hasNext()){
            String k = i2.next();

            System.out.println(k);
        }

        System.out.println("-------------------------------");
        for(String string : key){
            System.out.println(string);
        }
        System.out.println("-------------------------------");

        System.out.println(map.containsKey("Galaxy"));
        map.remove("Galaxy");
        System.out.println(map.containsKey("Galaxy"));

        System.out.println(map.size());
        
        Smartphone sm4 = map.get("Galaxy");
        System.out.println(sm4.getBrand() + " " + sm4.getModel()); // error


        HashMap<String, Smartphone> map2 = new HashMap<String, Smartphone>();
    }

    public void getConfig(){
        Properties p = new Properties();
        try{
            InputStream is = new FileInputStream(new File("config.properties"));
            p.load(is);

            System.out.println(p.getProperty("db-name"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
