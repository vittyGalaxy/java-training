package section8;

public class ElectronicProduct extends Product{
    private String model;
    private String brand;

    // getter
    public String getModel(){
        return this.model;
    }

    public String getBrand(){
        return this.brand;
    }

    // setter
    public void setModel(String model){
        this.model = model;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
}
