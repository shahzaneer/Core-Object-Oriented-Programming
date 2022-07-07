public class WeeklyEmployee extends Employee {
    private int weeklySalary;

    public WeeklyEmployee() {
    }
    
    public WeeklyEmployee(String firstName, String lastName, long SSN, int weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    
    @Override
    public double earnings() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nWeekly Salary : %d ", weeklySalary);
    }

}