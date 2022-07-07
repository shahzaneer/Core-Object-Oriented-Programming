public class Student {
    private String name;
    private int rollNumber;

    public Student() {
    }

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return this.rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", rollNumber='" + getRollNumber() + "'" +
            "}";
    }

}
