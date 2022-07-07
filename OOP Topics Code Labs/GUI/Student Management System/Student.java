import java.io.Serializable;

public class Student extends Person implements Serializable {
    private double GPA;
    private int semester;
    private String section;
    private Department department;

    public Student() {
        super();
    }

    public Student(String name , String phone , String gender ,double GPA, int semester, String section, Department department) {
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

    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
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
        return "------------------------------------------------\n" +
            super.toString() +
            " GPA : " + getGPA() + "\n" +
            "Semester :" + getSemester() + "\n" +
            "Section :" + getSection() + "\n" +
            "Department :" + getDepartment() + "\n"+
            "------------------------------------------------\n";
    }


}