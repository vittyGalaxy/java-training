package section6;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;

    // getter
    public int getId(){
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
    public void setId(int id){
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
}
