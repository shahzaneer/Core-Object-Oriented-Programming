public class Employee {
    private String firstName;
    private String lastName;
    private My_Date birthDate;
    private My_Date hireDate;
    
    Employee()   //deafault    
    {
        birthDate = new My_Date();
        hireDate = new My_Date();
    }
    
    Employee( String f, String l, My_Date b, My_Date h)
    {
        firstName = f;
        lastName =l;
        birthDate =b;
        hireDate =h;
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
    
    public void display()
    {
        System.out.println(firstName);
        System.out.println(lastName);
      //  System.out.println(hireDate);
    hireDate.display();
    birthDate.display();
    
    }
    //assume Date class doesnot have a display function
    public void display2()
    {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(hireDate.getDay() + "  "+ hireDate.getMonth() + "  "+ hireDate.getYear());
        System.out.println(birthDate.getDay() + "  "+ birthDate.getMonth() + "  "+ birthDate.getYear());
    
    }

    public boolean isExperienced(int currentYear){
        if (currentYear - this.getHireDate().getYear() >= 5){ 
            return true;
        }
        return false;
    }
}