import javax.swing.event.SwingPropertyChangeSupport;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student("Shahzaneer Ahmed", new int [] {10,20,20,15,18});
        Student s2 = new Student("Fatima Mahsud", new int [] {13,20,20,15,18});

        Student s3 = new Student(s1.CompareAverage(s2));
        System.out.println(s3.getName());

    }
    

    
}
