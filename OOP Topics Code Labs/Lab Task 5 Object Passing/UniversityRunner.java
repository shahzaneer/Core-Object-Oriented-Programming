import java.util.Arrays;

public class UniversityRunner {
    public static void main(String[] args) {
        University u1 = new University("CUI ISB", "Dr Afzal");
        u1.setLocation("Islamabad");
        u1.addDepartment("CS");
        u1.addDepartment("Cyber");
        u1.addDepartment("AI");
        u1.addDepartment("DS");
        u1.addDepartment("SE");

        University u2 = new University("FAST Lahore", "Dr Abrar");
        u2.setLocation("Lahore");
        u2.addDepartment("CS");
        u2.addDepartment("SE");

        University u3 = new University(u1.compareDepartments(u2));

        // System.out.println(u1.equals(u3)); 
        
        System.out.println(Arrays.toString(u3.getDepartments()));
        System.out.println(u3.getLocation());
        // u1.display();
        // u2.display();

        



    }

}
