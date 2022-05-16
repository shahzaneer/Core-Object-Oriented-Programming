public class Student {
    int rollNo;
    int Name;


    public Student() {
    }

    public Student(int rollNo, int Name) {
        this.rollNo = rollNo;
        this.Name = Name;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getName() {
        return this.Name;
    }

    public void setName(int Name) {
        this.Name = Name;
    }

    public Student rollNo(int rollNo) {
        setRollNo(rollNo);
        return this;
    }

    public Student Name(int Name) {
        setName(Name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return rollNo == student.rollNo && Name == student.Name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, Name);
    }

    @Override
    public String toString() {
        return "{" +
            " rollNo='" + getRollNo() + "'" +
            ", Name='" + getName() + "'" +
            "}";
    }

}
