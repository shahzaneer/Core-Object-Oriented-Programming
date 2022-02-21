import java.util.Scanner;
public class RunnerStudent {
    public static void main(String[] args) {

        Student shah = new Student();
        Student noor = new Student();

        String [] shahCourses= { "Multivariable Calculus","OOP","DSA","Communication","Genetics"};
        shah.setInfo("Shahzaneer Ahmed", "SP21-BCS-087",shahCourses);
        shah.displayInfo();

        noor.setInfo("Noor Ul Huda", "UK-MBBS_087",coursesRegis());
        

        

        // noor.setInfo("", regno, courses);

    }

    static String [] coursesRegis(){
        Scanner sc = new Scanner(System.in);
        String courses [] = new String [5];
        for(int i=0; i<courses.length;i++){
            System.out.println("Enter  Course "+(i+1));
            courses[i] = sc.nextLine();
        }
        return courses;

    }
    
}
