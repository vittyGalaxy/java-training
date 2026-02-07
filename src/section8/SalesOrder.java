package section8;
import java.util.Date;
import java.util.List;

public class SalesOrder {
    private long id;
    private Client client;
    private Date orderDate;
    private String orderStatus;
    private List<OrderLine> orderLine;
    
    public static final String BEEN_WAITING = "BEEN WAITING";
    public static final String BEEN_SHIPPED = "BEEN SHIPPED";
    public static final String BEEN_DELIVERED = "BEEN DELIVERED";

    // getter
    public long getId(){
        return this.id;
    }

    public Client getClient(){
        return this.client;
    }

    public Date getOrderDate(){
        return this.orderDate;
    }

    public String getOrderStatus(){
        return this.orderStatus;
    }

    public List<OrderLine> getOrderLines(){
        return this.orderLine;
    }

    // setter
    public void setId(long id){
        this.id = id;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public void setOrderDate(Date orderDate){
        this.orderDate = orderDate;
    }

    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }

    public void setOrderLine(List<OrderLine> orderLine){
        this.orderLine = orderLine;
    }
}
