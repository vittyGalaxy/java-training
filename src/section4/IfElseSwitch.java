package section4;

public class IfElseSwitch{
    private static IfElseSwitch singleton;

    public static IfElseSwitch getInstance(){
        if(singleton == null){
            singleton = new IfElseSwitch();
        }
        return singleton;
    }

    public int max(int n1, int n2, int n3){
        int max_n = 0;

        if (n1 > n2 && n1 > n3){
            max_n = n1;
        } else if(n2 > n1 && n2 > n3){
            max_n = n2;
        } else {
            max_n = n3;
        }

        return max_n;
    }

    public boolean isNull(String text){
        if (text == null){
            return true;
        }

        return false;
    }

    public String recoverText(int cod){
        String text = null;
        switch (cod) {
            case 1:
                text = "cod 1";
                break;
            case 2:
                text = "cod 2";
                break;
            case 3:
                text = "cod 3";
                break;
        
            default:
                text = "trial";
                break;
        }
        return text;
    }
}