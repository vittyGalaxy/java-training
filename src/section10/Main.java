package section10;

import section10.Apartment;
import section10.StandardRoom;
import java.util.List;
import section10.Apartment.InnerRoom;;

public class Main {
    public static void main(String[] args){
        Apartment a = new Apartment();
        a.setFloor(0);
        a.getStRoom().add(new StandardRoom(16, "kitchenette"));

        a.addRoom(30, "kitchenette");

        List<StandardRoom> room1 = a.getStRoom();

        for (StandardRoom standardRoom : room1){
            System.out.println(standardRoom.getSquareMeters());
        }

        List<InnerRoom> room2 = a.getInRoom();
        for (InnerRoom innerRoom : room2){
            System.out.println(innerRoom.getSquareMeters());
        }
    }
}
