public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Noor Ul huda", new int [] {10,22,10,30,40});
        s1.setName("Shahzaneer Ahmed");
        s1.setResult(new int [] {20,30,10,40,10});

        System.out.println(s1.CalculateAverage());
        System.out.println(s2.CalculateAverage());

        Student s3 = new Student(s1.getName(),s2.getResult());
        System.out.println(s3.getName());
        System.out.println(s3.CalculateAverage()); 
    }
    
}
