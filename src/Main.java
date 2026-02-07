import java.util.ArrayList;
import java.util.Date;
import section8.Television;
import section8.Client;
import section8.OrderLine;
import section8.SalesOrder;
import section8.Smartphone;

public class Main {

    public static void main(String[] args){
        SalesOrder so = new SalesOrder();

        so.setClient(new Client());
        so.setOrderDate(new Date());
        so.setOrderStatus(SalesOrder.BEEN_DELIVERED);
        so.setOrderLine(new ArrayList<OrderLine>());

        so.getClient().setTaxIdCode("abcde");
        so.getClient().setSurname("Preite");
        so.getClient().setName("Paolo");

        Smartphone sm1 = new Smartphone();
        sm1.setBrand("Apple");
        sm1.setModel("iPhone");
        sm1.setPrice(800);

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setModel("SMART TV");
        tv1.setPrice(1000);

        OrderLine ol1 = new OrderLine(1, sm1, 1, sm1.getPrice());
        OrderLine ol2 = new OrderLine(1, tv1, 1, tv1.getPrice());
        so.getOrderLines().add(ol1);
        so.getOrderLines().add(ol2);

    }
}
