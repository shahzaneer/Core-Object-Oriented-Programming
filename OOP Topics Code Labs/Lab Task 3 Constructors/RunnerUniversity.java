public class RunnerUniversity {
    public static void main(String[] args) {
    
        String [] departments = {"CS","English"};
        String uniName = "CUI Islamabad";
        String location = "Islamabad";
        String rectorName = "junaid Zaidi";

        University uni = new University();
        uni.setValues(uniName,rectorName,location,departments);
        // uni.display()
        uni.addDepartment("pshycology");
        uni.display();
        uni.addDepartment("meths");
        uni.display();
        uni.addDepartment("chemistry");
        uni.display();
        uni.addDepartment("BBA");
        uni.display();


        

        

        
        
    }
    
}
