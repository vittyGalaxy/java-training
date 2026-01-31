package section6;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;

    public Product(int id, String name, double price){
        super();
        setId(id);
        setName(name);
        setPrice(price);
    }

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

    public List<String> getStores(){
        ArrayList<String> t = new ArrayList<String>();

        t.add("shop 1");
        t.add("shop 2");
        t.add("shop 3");
        t.add("shop 4");

        return t;
    }
}
