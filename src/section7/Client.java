package section7;

public class Client {
    private long id;
    private String name;
    private String surname;
    private String taxIdCode;

    // getter
    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getTaxIdCode(){
        return this.taxIdCode;
    }

    // setter
    public void setId(long id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setTaxIdCode(String taxIdCode){
        this.taxIdCode = taxIdCode;
    }
}
