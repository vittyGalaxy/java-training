package section10;

public class GeometricShape implements GeneratesData{
    private double side1;
    private double side2;
    private double side3;
    private double side4;
    private double side5;

    // getter
    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public double getSide3(){
        return this.side3;
    }

    public double getSide4(){
        return this.side4;
    }

    public double getSide5(){
        return this.side5;
    }

    // setter
    public void setSide1(double side){
        this.side1 = side;
    }

    public void setSide2(double side){
        this.side2 = side;
    }

    public void setSide3(double side){
        this.side3 = side;
    }

    public void setSide4(double side){
        this.side4 = side;
    }

    public void setSide5(double side){
        this.side5 = side;
    }

    public double getPerimeterCalculation(){
        return 0;
    }

    public double getPerimeterArea(){
        return 0;
    }

    @Override
    public String generateXML() {
        return null;
    }
}
