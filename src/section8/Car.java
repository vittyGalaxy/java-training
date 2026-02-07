package section8;

public class Car extends Product{
    private String c;
    private String painting;
    private String motor;
    private String power;

    // getter
    public String getC(){
        return this.c;
    }

    public String getPainting(){
        return this.painting;
    }

    public String getMotor(){
        return this.motor;
    }

    public String getPower(){
        return this.power;
    }

    // setter
    public void setC(String c){
        this.c = c;
    }

    public void setpainting(String painting){
        this.painting = painting;
    }

    public void setMotor(String motor){
        this.motor = motor;
    }

    public void setPower(String power){
        this.power = power;
    }

    @Override
    public void printProduct(){
        System.out.println(getC() + " " + getPainting() + " " + getMotor() + " " + getPower());
    }
}
