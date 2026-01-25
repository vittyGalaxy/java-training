package section4;

public class WhileDowhileFor {
    public void iterateWhile(int counter, int extrime){
        while(counter < extrime){
            System.out.println(counter);
            counter++;
        }
        System.out.println("exit while");
    }

    public void iterateDowhile(int counter, int extrime){
        do{
            System.out.println(counter);
            counter++;
        }while(counter < extrime);
        System.out.println("exit do-while");
    }

    public void iterateFor(int counter){
        for (int i = 0; i < counter; i++){
            System.out.println(i);
        }
        System.out.println("exit for");
    }

    public void iterateForArrString(String[] arr){
        if (arr != null){
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }

            for (String i : arr){
                System.out.println(i);
            }
        }
        System.out.println("exit for");
    }

    public void iterateForArrInt(int[] arr){
        if (arr != null){
            for (int i : arr){
                System.out.println(i);
            }
        }
        System.out.println("exit for");
    }
}
