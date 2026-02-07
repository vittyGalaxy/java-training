import java.util.List;
import section8.Television;

public class Main {

    public static void main(String[] args){
        Television tv = new Television(12345, "TV", 300.0);
        tv.setName("SMARTV");
        System.out.println(tv.getName());

        List<String> t = tv.getStores();
        System.out.println("Shop Television");
        for (String string : t){
            System.out.println(string);
        }
    }
}
