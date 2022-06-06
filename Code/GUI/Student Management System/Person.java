import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String Phone;
    private String gender;


    public Person() {
    }

    public Person(String name, String Phone, String gender) {
        this.name = name;
        this.Phone = Phone;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return
            "Name: " + getName() + "\n" +
            "Phone='" + getPhone() + "\n" +
            "gender='" + getGender() + "\n";
    }

}
