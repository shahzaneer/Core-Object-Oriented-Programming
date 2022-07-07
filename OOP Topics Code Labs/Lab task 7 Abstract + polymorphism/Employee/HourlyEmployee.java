public class HourlyEmployee extends Employee {
    private int hours;
    private double wagePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String firstName, String lastName, long SSN, int hours, double wagePerHour) {
        super(firstName, lastName, SSN);
        this.hours = hours;
        this.wagePerHour = wagePerHour;
    }

    @Override
    public double earnings() {
        return hours * wagePerHour;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("\nHours : %d\nWage per Hour : %f", hours,wagePerHour);
    }
}
