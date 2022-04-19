public class Student extends Person {
    private double CGPA;

    public Student() {
    }
    
    public Student(String name, double CGPA) {
        super(name);
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return this.CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    @Override
    public boolean isOutstanding() {
        if (this.CGPA >= 3.5) {
            return true;
        }
        return false;
    }

    
    @Override
    public String toString() {
        return super.toString() +  "{" +
            " CGPA='" + getCGPA() + "'" +
            "}";
    }

}
