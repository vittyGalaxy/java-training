package section10;

public class Product implements GeneratesData{
    private long id;
    private String name;
    private String code;
    private double price;

    // getter
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getCode(){
        return this.code;
    }

    public double getPrice(){
        return this.price;
    }

    // setter
    public void setId(long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setName(double price){
        this.price = price;
    }

    @Override
    public String generateXML(){
        String xml =
        "<product>" +
            "<code>" + getCode() + "</code>" +
            "<name>" + getName() + "</name>" +
            "<price>" + getPrice() + "</price>" +
        "</product>";

        return xml;
    }


}
