package section10;

public class StandardRoom {
    private double squareMeters;
    private String accessories;

    public StandardRoom(double squareMeters, String accessories){
        super();
        setSquareMeters(squareMeters);
        setAccessories(accessories);
    }

    // getter
    public double getSquareMeters(){
        return this.squareMeters;
    }

    public String getAccessories(){
        return this.accessories;
    }
    
    // setter
    public void setSquareMeters(double squareMeters){
        this.squareMeters = squareMeters;
    }

    public void setAccessories(String accessories){
        this.accessories = accessories;
    }
}
