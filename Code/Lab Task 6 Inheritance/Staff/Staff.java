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

    @Override
    public void display(){
        super.display();
        System.out.println("The title is : "+this.title);
    }
}
