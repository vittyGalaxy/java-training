package section6;

import java.util.ArrayList;
import java.util.List;

public class Smartphone extends Product{
    private String serialNumber;
    private String imei;
    private String brand;
    private String model;
    private Display screen;

    public Smartphone(int id, String name, double price){
        super(id, name, price);
    }

    //getter
    public String getSerialNumber(){
        return this.serialNumber;
    }

    public String getImei(){
        return this.imei;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public Display getScreen(){
        return this.screen;
    }

    //setter
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public void setImei(String imei){
        this.imei = imei;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setScreen(Display screen){
        this.screen = screen;
    }

    @Override
    public List<String> getStores(){
        ArrayList<String> t = new ArrayList<String>();

        t.add("shop 1");
        t.add("shop 2");

        return t;
    }
}
