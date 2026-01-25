package section4;

public class BreakContinue {
    public void exampleBreak(int interrupt, int extrime){
        for(int i = 0; i < extrime; i++){
            System.out.println(i);
            if (i == interrupt){
                System.out.println("Interrupt");
                break;
            }
        }
        System.out.println("exit for");
    }

    public void exampleContinue1(int cont, int extrime){
        for(int i = 0; i < extrime; i++){
            if (i == cont){
                System.out.println("continue");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("exit for");
    }

    public void exampleContinue2(int cont, int extrime){
        for(int i = 0; i < extrime; i++){
            if (i %2 == 0){
                System.out.println("continue");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("exit for");
    }
}
