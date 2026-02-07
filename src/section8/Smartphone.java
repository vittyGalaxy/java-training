package section8;

public class Smartphone extends ElectronicProduct{
    private String display;
    private String cpu;
    private String ram;

    // getter
    public String getDisplay(){
        return this.display;
    }

    public String getCpu(){
        return this.cpu;
    }

    public String getRam(){
        return this.ram;
    }

    // setter
    public void setDisplay(String display){
        this.display = display;
    }

    public void setCpu(String cpu){
        this.cpu = cpu;
    }

    public void setRam(String ram){
        this.ram = ram;
    }

    @Override
    public void printProduct(){
        System.out.println(getId() + " " + getModel() + " " + getBrand() + " " + getCpu());
    }
}
