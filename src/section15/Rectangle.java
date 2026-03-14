package section15;

public class Rectangle implements GeometricShape {
    @Override
    public double calculateArea(double side1, double side2) {
        return side1 * side2;
    }
}
