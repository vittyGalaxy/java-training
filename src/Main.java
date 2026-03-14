import java.util.concurrent.Callable;

import section15.GeometricShape;
import section15.PrintUppercase;
import section15.Rectangle;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("Thread without Lambda Expressions");
            }
        };

        Thread t2 = new Thread(() -> System.out.println("Thread created using Lambda Expressions..."));

        Thread t3 = new Thread(() -> {
            int count = 0;
            while(true) {
                if (count %2 == 0) {
                    System.out.println("count is: " + count);
                }

                if (count == 100) {
                    break;
                }

                count++;
            }
        });

        t1.start();
        t2.start();
        t3.start();

        Thread t4 = new Thread(() -> {
            System.out.println("I'm in thread 4");
            int max = 0;
            while(max < 10){
                System.out.println("max: " + max);
                if (max == 5) {
                    break;
                }
            }
        });

        String name = null;
        String surname = null;
        greet(name, surname);
    }

    private static void greet(String name, String surname){
        Callable<String> callMe = () -> {
            if (name == null && surname == null) {
                throw new Exception("Name and surname are not entered");
            } else if (name == null && surname != null){
                throw new Exception("The name was not entered");
            } else if (name != null && surname == null) {
                throw new Exception("The surname was not entered");
            } else {
                return "Hello " + name + " " + surname;
            }
        };
    }
}