package section11;

import section7.Smartphone;

public class ArrayList {
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
}
