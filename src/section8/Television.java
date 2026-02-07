package section8;
import section6.Product;

public class Television extends Product {
    private String inches;
    private String accessories;

    public Television(int id, String name, double price){
        super(id, name, price);
    }

    // getter
    public String getInches(){
        return this.inches;
    }

    public String getAccessories(){
        return this.accessories;
    }

    // setter
    public void setInches(String inches){
        this.inches = inches;
    }

    public void setAccessories(String accessories){
        this.accessories = accessories;
    }

    public void changeChannel(){

    }

    public void on(){

    }
}
