public class Student implements Comparable {
    int rollNo;
    String Name;


    public Student() {
    }

    public Student(int rollNo, String Name) {
        this.rollNo = rollNo;
        this.Name = Name;
    }

    public int getRollNo() {
        return this.rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    

    @Override
    public String toString() {
        return "{" +
                " rollNo='" + getRollNo() + "'" +
                ", Name='" + getName() + "'" +
                "}";
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(12, "Shahzaneer Ahmed");
        Student s2 = new Student(34, "Kaleem Khan");

        if (s1.compareTo(s2) < 0) {
            
            System.out.println("s2 barra hai jeee");

            // == 0 ka mtlb equal hain
            // < s2 bara hai 
            // > s1  barra hai 
        }

    }

    
    @Override
    public int compareTo(Object o) {
        Student Alpha = (Student) o;
        int diff = (int) (this.rollNo - Alpha.rollNo);
        return diff;

    }

}
