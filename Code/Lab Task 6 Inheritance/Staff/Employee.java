public class Employee extends Person {
    private String office;
    private double salary;
    private My_Date hiredDate;

    public Employee(){
        super();
    }

    public Employee(String name , String address , String phoneNumber , String emailAddress, String office , double salary , My_Date hiredDate){
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public void setOffice(String office){
        this.office = office;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setHiredDate(My_Date hiredDate){
        this.hiredDate = hiredDate;
    }

    public String getOffice(){
        return this.office;
    }
    public double getSalary(){
        return this.salary;
    }
    public My_Date getHiredDate(){
        return this.hiredDate;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(this.office);
        System.out.println(this.salary);
        this.hiredDate.display();
    }
}
