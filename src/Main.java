import section10.AbstractProduct;
import section10.Television;
import section10.WashingMachine;

public class Main {

    public static void main(String[] args){
        AbstractProduct p = new Television();
        p.calculateShipping();
        p.calculateSales();
        
        WashingMachine w = new WashingMachine();
        w.calculateShipping();
        w.calculateSales();
    }
}
