import java.io.Serializable;

public class Employee implements Serializable{
    private String name;
    private Job j;
    private String headName;

    public Employee() {
    }

    public Employee(String name, Job j, String headName) {
        this.name = name;
        this.j = j;
        this.headName = headName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJ() {
        return this.j;
    }

    public void setJ(Job j) {
        this.j = j;
    }

    public String getHeadName() {
        return this.headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }


    @Override
    public String toString() {
        return 
            " Name = " + getName() + "\n" +
            " Job = " + getJ().toString() + "\n" +
            " Head-Name='" + getHeadName() + "\n";
    }


}
