import java.io.Serializable;

public class Department implements Serializable {
    private String name;
    private String location;

    public Department() {
    }

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return
            " Department Name :" + getName() + "\n" +
            ", location='" + getLocation() + "\n";
    }

}
