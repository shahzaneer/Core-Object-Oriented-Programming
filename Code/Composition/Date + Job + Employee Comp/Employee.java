public class Employee {
    private String firstName;
    private String lastName;
    private My_Date birthDate;
    private My_Date hireDate;
    private Job job;
    
    Employee()      
    {
        birthDate = new My_Date();
        hireDate = new My_Date();
        job = new Job();
    }
    
    Employee( String f, String l, My_Date b, My_Date h , Job job)
    {
        firstName = f;
        lastName =l;
        birthDate =b;
        hireDate =h;
        this.job = job;
    }
    
    public void setBirthDate(My_Date b)
    {
        birthDate = b;
    }
    
    public My_Date getBirthDate()
    {
        return birthDate;
    }
    
    public void setHireDate(My_Date b)
    {
        hireDate = b;
    }
    
    public My_Date getHireDate()
    {
        return hireDate;
    }

    public Job getJob(){
        return this.job;
    }

    public void setJob(Job job){
        this.job = job;
    }
    
    public void display()
    {
        System.out.println(firstName);
        System.out.println(lastName);
    hireDate.display();
    birthDate.display();
    job.display();
    
    }    

    public boolean isExperienced(int currentYear){
        if (currentYear - this.getHireDate().getYear() >= 5){ 
            return true;
        }
        return false;
    }

    public boolean checkSalary(){
        if(this.job.setSalary() >= 50000){
            return true;
        }
        return false;
    }
}