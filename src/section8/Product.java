package section8;

public class Product {
    private long id;
    private String name;
    private String description;
    private double price;
    private Category category;

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

    public Category getCategory(){
        return this.category;
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

    public void setCategory(Category category){
        this.category = category;
    }

    public void printProduct(){
        System.out.println(getId() + " " + getName() + " " + getPrice());
    }
}
