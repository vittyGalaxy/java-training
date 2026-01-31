import section6.Book;
import section6.Product;
import section6.Smartphone;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Product p = new Product();
        List<String> s1 = p.getStores();
        System.out.println("Shop Product");
        for(String string : s1){
            System.out.println(string);
        }

        Smartphone s = new Smartphone();
        List<String> s2 = s.getStores();
        System.out.println("Shop Smartphone");
        for(String string : s2){
            System.out.println(string);
        }

        Book b = new Book();
        List<String> s3 = b.getStores();
        System.out.println("Shop Book");
        for(String string : s3){
            System.out.println(string);
        }
    }
}
