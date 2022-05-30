import java.io.Serializable;

public class Student extends Person implements Serializable {
    private double GPA;
    private int semester;
    private char section;
    private Department department;

    public Student() {
        super();
    }

    public Student(String name , String phone , String gender ,double GPA, int semester, char section, Department department) {
        super(name, phone, gender);
        this.GPA = GPA;
        this.semester = semester;
        this.section = section;
        this.department = department;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public char getSection() {
        return this.section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
            " GPA='" + getGPA() + "'" +
            ", semester='" + getSemester() + "'" +
            ", section='" + getSection() + "'" +
            ", department='" + getDepartment() + "'" +
            "}";
    }


}