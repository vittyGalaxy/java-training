package section8;

public class OrderLine {
    private long id;
    private Product product;
    private int quantity;
    private double unitPrice;
    private SalesOrder salesOrder;

    public OrderLine(long id, Product product, int quantity, double unitPrice){
        super();
        setId(id);
        setProduct(product);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    // getter
    public long getId(){
        return this.id;
    }

    public Product getProduct(){
        return this.product;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getUnitPrice(){
        return this.unitPrice;
    }

    public SalesOrder getSalesOrder(){
        return this.salesOrder;
    }

    // setter
    public void setId(long id){
        this.id = id;
    }

    public void setProduct(Product product){
        this.product = product;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public void setSalesOrder(SalesOrder salesOrder){
        this.salesOrder = salesOrder;
    }
}
