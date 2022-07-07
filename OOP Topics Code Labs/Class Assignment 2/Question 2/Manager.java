import java.util.Arrays;

public class Manager extends Person {
    private Employee[] e = new Employee [3];
    private int noOfProjects;
    private int projectPay;

    
    public Manager(String firstName, My_Date HireData, boolean hasCompanyCar, Employee[] e, int noOfProjects,
            int projectPay) {
        
        super(firstName, HireData, hasCompanyCar);
        this.e = e;
        this.noOfProjects = noOfProjects;
        this.projectPay = projectPay;
    }

    public Employee[] getE() {
        return this.e;
    }

    public void setE(Employee[] e) {
        this.e = e;
    }

    public int getNoOfProjects() {
        return this.noOfProjects;
    }

    public void setNoOfProjects(int noOfProjects) {
        this.noOfProjects = noOfProjects;
    }

    public int getProjectPay() {
        return this.projectPay;
    }

    public void setProjectPay(int projectPay) {
        this.projectPay = projectPay;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
            " e='" +Arrays.toString(getE())  + "'" +
            ", noOfProjects='" + getNoOfProjects() + "'" +
            ", projectPay='" + getProjectPay() + "'" +
                "}" + "earnings " + earning();
            
    }



    @Override
    public double earning() {
        return getNoOfProjects() * getProjectPay();
    }
}