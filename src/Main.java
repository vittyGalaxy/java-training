import section15.GeometricShape;
import section15.Rectangle;

public class Main {
    public static void main(String[] args) {
        GeometricShape gs = new Rectangle();
        gs.calculateArea(3, 4);

        GeometricShape r = (a, b) -> a * b;
        r.calculateArea(3, 4);

        GeometricShape q = (a, b) -> a * b;
        q.calculateArea(3, 3);
    }
}