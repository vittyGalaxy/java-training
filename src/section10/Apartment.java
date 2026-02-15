package section10;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private int floor;

    private List<StandardRoom> stRoom;
    private List<InnerRoom> inRoom;

    public void addRoom(double squareMeters, String accessories){
        class CalculatePerimeter{
            public double calculate(double side1, double side2){
                return (side1 + side2);
            }
        }
        
        CalculatePerimeter cp = new CalculatePerimeter();
        cp.calculate(3, 6);

        getInRoom().add(new InnerRoom(squareMeters, accessories));
    }

    public class InnerRoom {
        private double squareMeters;
        private String accessories;

        public InnerRoom(double squareMeters, String accessories){
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

    // getter
    public int getFloor(){
        return this.floor;
    }

    public List<StandardRoom> getStRoom(){
        if(this.stRoom == null){
            this.stRoom = new ArrayList<StandardRoom>();
        }
        return this.stRoom;
    }

    public List<InnerRoom> getInRoom(){
        if(this.inRoom == null){
            this.inRoom = new ArrayList<InnerRoom>();
        }
        return this.inRoom;
    }

    // setter
    public void setFloor(int floor){
        this.floor = floor;
    }

    public void setStRoom(List<StandardRoom> stRoom){
        this.stRoom = stRoom;
    }

    public void setInRoom(List<InnerRoom> inRoom){
        this.inRoom = inRoom;
    }
}
