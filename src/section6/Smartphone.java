package section6;

public class Smartphone {
    private String serialNumber;
    private String imei;
    private String brand;
    private String model;
    private Display screen;

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
}
