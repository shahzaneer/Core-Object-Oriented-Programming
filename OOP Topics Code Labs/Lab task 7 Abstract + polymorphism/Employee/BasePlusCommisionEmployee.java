public class BasePlusCommisionEmployee extends CommisionEmployee {

    // basePlusCommissionEmployee extends CommisionEmployee , Employee is not allowed in java
    // you can only extend one class. 
    // extending two classes means you are doing multiple inheritance which is not allowed in java 
    // however you can implement multiple interfaces.

    private double basicSalary;

    public BasePlusCommisionEmployee() {
    }

    public BasePlusCommisionEmployee(String firstName, String lastName, long SSN , int sales, int commissionRate, double basicSalary) {
        super(firstName, lastName, SSN, sales, commissionRate);
        this.basicSalary = basicSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + basicSalary;
    }

    public void setBaseSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBaseSalary() {
        return this.basicSalary;
    }


    
    @Override
    public String toString() {
        return super.toString() + String.format("\nBasic Salary : %f", basicSalary);
    }
}
