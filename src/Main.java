import java.io.File;

import section3.IfElseSwitch;

public class Main {

    public static void main(String[] args){
        IfElseSwitch test = new IfElseSwitch();
        System.out.println(test.max(5, 3, 4));

        System.out.println(test.isNull("trial"));

        System.out.println(IfElseSwitch.getInstance().isNull("text"));

        System.out.println(IfElseSwitch.getInstance().recoverText(1));
        System.out.println(IfElseSwitch.getInstance().recoverText(2));
        System.out.println(IfElseSwitch.getInstance().recoverText(3));
        System.out.println(IfElseSwitch.getInstance().recoverText(4));
    }
}
