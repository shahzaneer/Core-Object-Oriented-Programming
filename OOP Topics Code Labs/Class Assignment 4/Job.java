import java.io.Serializable;

public class Job implements Serializable{
    private String designation;
    private double salary;


    public Job() {
    }

    public Job(String designation, double salary) {
        this.designation = designation;
        this.salary = salary;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    

    @Override
    public String toString() {
        return 
            " Designation =" + getDesignation() + "\n" +
            " Salary= " + getSalary() + "\n";
    }

}