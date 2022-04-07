public class Staff extends Employee {
    private String title;

    public Staff(){
        super();
    }

    public Staff(String name , String address , String phoneNumber , String emailAddress,String office, double salary , My_Date hiredDate,  String title){
        super(name, address, phoneNumber, emailAddress, office, salary, hiredDate);
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

    
    // Display is only made within the Staff and faculty function
    // as attributes are mostly private therefore we have used the getters to get the value
    
    public void display(){
        System.out.println(this.getName());
        System.out.println(this.getAddress());
        System.out.println(this.getEmailAddress());
        System.out.println(this.getPhoneNumber());
        System.out.println(this.getSalary());
        System.out.println(this.getOffice());
        System.out.println(this.getHiredDate());
        System.out.println("The title is : "+this.title);
    }
}
