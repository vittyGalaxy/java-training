package section11;

import java.util.ArrayList;
import java.util.List;

import section7.Smartphone;

public class ArrayListClass {
    public void createArray(){
        int[] test;
        test = new int[5];
        

        int[] numbers = new int[10];

        numbers[0] = 10;
        numbers[1] = 11;
        numbers[2] = 12;
        numbers[3] = 13;
        numbers[4] = 14;
        numbers[5] = 15;
        numbers[6] = 16;
        numbers[7] = 17;
        numbers[8] = 18;
        numbers[9] = 19;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 10+i;
        }

        Smartphone[] products = new Smartphone[3];
        products[0] = new Smartphone();
        products[0].setBrand("Apple");
        products[0].setName("iPhone");

        products[1] = new Smartphone();
        products[1].setBrand("Samsung");
        products[1].setName("Note");

        products[2] = new Smartphone();
        products[2].setBrand("Huawi");
        products[2].setName("P8Lite");

        for(int i = 0; i < products.length; i++){
            Smartphone sm = products[i];
            System.out.println(sm.getBrand() + " " + sm.getName());
        }

        for(Smartphone sm : products){
            System.out.println(sm.getBrand() + " " + sm.getName());
        }
    }

    public void multidimensionalArray(){
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = i + j;
            }
        }

        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

    public void exampleArrayList(){
        List<String> l = new ArrayList<String>();
        l.add("Paolo");
        l.add("Mario");
        l.add("Chiara");
        l.add("Marta");

        l.add(2, "Valerio");

        for (String string : l){
            System.out.println(string);
        }

        l.remove(2);

        System.out.println("-------------------------------");
        for (String string : l){
            System.out.println(string);
        }

        l.set(2, "Claudia");
        System.out.println("-------------------------------");
        for (String string : l){
            System.out.println(string);
        }

        System.out.println(l.size());
        System.out.println(l.isEmpty());
        
        l.clear();

        System.out.println(l.size());
        System.out.println(l.isEmpty());

        l.add("Paolo");
        l.add("Mario");
        l.add("Chiara");
        l.add("Marta");
        
        System.out.println("-------------------------------");
        System.out.println("Mario is at position " + l.indexOf("Mario"));

        System.out.println("-------------------------------");
        System.out.println(l.toString());

        String[] la1 = (String[])l.toArray();
        String[] la2 = l.toArray(new String[l.size()]);
        
        List<Smartphone> l2 = new ArrayList<Smartphone>();
        Smartphone sm = new Smartphone();
        sm.setBrand("Apple");
        sm.setModel("iPhone");
        l2.add(sm);
        
        Smartphone sm2 = new Smartphone();
        sm2.setBrand("Samsung");
        sm2.setModel("Galaxy");
        l2.add(sm2);

        System.out.println("-------------------------------");
        System.out.println(l2.toString());
    }
}
