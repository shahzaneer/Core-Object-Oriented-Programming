public class CommisionEmployee extends Employee {
    private int sales;
    private int commissionRate;
    
    public CommisionEmployee() {
    }

    public CommisionEmployee(String firstName, String lastName, long SSN, int sales, int commissionRate) {
        super(firstName, lastName, SSN);
        this.commissionRate = commissionRate;
        this.sales = sales;
    }
    
    @Override
    public double earnings() {
        return sales * commissionRate;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("\n Sales : %d\nCommission Rate : %d", sales,commissionRate);
    }
}
