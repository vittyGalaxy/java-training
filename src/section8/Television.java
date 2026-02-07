package section8;

public class Television extends ElectronicProduct {
    private String inches;
    private String accessories;

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
}
