import section3.WhileDowhileFor;

public class Main {

    public static void main(String[] args){
        String[] arr1 = new String[] {"text1", "text2", "text3", "text4", "text5"};
        int[] arr2 = new int[] {1, 2, 3, 4, 5};
        WhileDowhileFor w = new WhileDowhileFor();
        w.iterateWhile(0, 10);
        w.iterateDowhile(0, 10);
        w.iterateFor(10);
        w.iterateForArrString(arr1);
        w.iterateForArrInt(arr2);
    }
}
