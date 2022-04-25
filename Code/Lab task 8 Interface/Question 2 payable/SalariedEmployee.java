public class SalariedEmployee  extends Employee{
    private double weeklySalary;


    //! Interface was only necessary for the implementation of Parent class not the child class


    public SalariedEmployee() {
    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }
    
    public double getWeeklySalary() {
        return this.weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }


    @Override
    public String toString() {
        return  super.toString() + "{" +
            " weeklySalary='" + getWeeklySalary() + "'" +
            "}";
    }

}
