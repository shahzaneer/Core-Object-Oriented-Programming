public abstract class Person {
    private String firstName;
    private My_Date HireData;
    private boolean hasCompanyCar;


    public Person(String firstName, My_Date HireData, boolean hasCompanyCar) {
        this.firstName = firstName;
        this.HireData = HireData;
        this.hasCompanyCar = hasCompanyCar;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public My_Date getHireData() {
        return this.HireData;
    }

    public void setHireData(My_Date HireData) {
        this.HireData = HireData;
    }

    public boolean isHasCompanyCar() {
        return this.hasCompanyCar;
    }

    public boolean getHasCompanyCar() {
        return this.hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }



    public abstract double earning();
    

    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", HireData='" + getHireData().toString() + "'" +
            ", hasCompanyCar='" + isHasCompanyCar() + "'" +
            "}";
    }

    
}