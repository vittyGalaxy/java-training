package section8;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<String> getStores(){
        ArrayList<String> t = new ArrayList<String>();
        t.add("Shop 1");
        t.add("Shop 3");
        return t;
    }
}
