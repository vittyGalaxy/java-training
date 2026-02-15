package section10;

public abstract class AbstractProduct {
    private long id;
    private String name;
    private String description;
    private double price;

    // getter
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }

    // setter
    public void setId(long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public abstract double calculateShipping();
    public abstract int calculateSales();
}
