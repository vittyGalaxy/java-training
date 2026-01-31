package section6;

public class Display {
    private String brand;
    private String model;
    private String resolution;
    
    // getter
    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public String getResolution(){
        return this.resolution;
    }
    
    // setter
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setResolution(String resolution){
        this.resolution = resolution;
    }
}
