package section15;

public class UserClass {
    private String name;
    private String surname;
    private int age;
    private String cityResidence;
    private String email;
    private String password;

    public UserClass(String name, String surname, int age, String cityResidence, String email, String password) {
        super();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cityResidence = cityResidence;
        this.email = email;
        this.password = password;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getCityResidence() {
        return this.cityResidence;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCityResidence(String cityResidence) {
        this.cityResidence = cityResidence;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
