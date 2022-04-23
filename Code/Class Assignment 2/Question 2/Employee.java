public class Employee extends Person{
    private String designation;
    private int wage;
    private int workingHours;


    public Employee(String firstName, My_Date HireData, boolean hasCompanyCar, String designation, int wage,
            int workingHours) {
        super(firstName, HireData, hasCompanyCar);
        this.designation = designation;
        this.wage = wage;
        this.workingHours = workingHours;
    }


    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getWage() {
        return this.wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getWorkingHours() {
        return this.workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }


    @Override
    public double earning() {
        return wage * workingHours;
    }
    

    @Override
    public String toString() {
        return super.toString() +  "{" +
            " designation='" + getDesignation() + "'" +
            ", wage='" + getWage() + "'" +
            ", workingHours='" + getWorkingHours() + "'" +
                "}"
            + "Earnings " +  earning();
    }



}
