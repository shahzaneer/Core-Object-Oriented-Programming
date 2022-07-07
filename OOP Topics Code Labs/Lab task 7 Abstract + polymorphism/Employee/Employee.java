public abstract class Employee{
    private String firstName;
    private String lastName;
    private long SSN;

    // Constructors

    public Employee() {

    }
    
    public Employee(String firstName, String lastName, long SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public abstract double earnings();

    public void display() {
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.SSN);
    }

    @Override
    public String toString() {
        return String.format("First name : %s \nLast Name : %s \nSSN : %d", firstName, lastName, SSN);
    }



}

