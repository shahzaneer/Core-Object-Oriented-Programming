public class Faculty extends Employee {
    private double officeHours;
    private String rank;

    public Faculty(){
        super();
    }
    public Faculty(String name , String address , String phoneNumber , String emailAddress,String office, double salary , My_Date hiredDate,double officeHours, String rank){
        super(name, address, phoneNumber, emailAddress, office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public void setOfficeHours(double officeHours){
        this.officeHours = officeHours;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
    public double getOfficeHours(){
        return this.officeHours;
    }
    public String getRank(){
        return this.rank;
    }

    
    public void display(){
        System.out.println(this.getName());
        System.out.println(this.getAddress());
        System.out.println(this.getEmailAddress());
        System.out.println(this.getPhoneNumber());
        System.out.println(this.getSalary());
        System.out.println(this.getOffice());
        // System.out.println(this.getHiredDate());
        this.getHiredDate().display(); // we cannot object print rather we will display its content!
        System.out.println("Office Hours "+this.officeHours);
        System.out.println("Rank "+this.rank);
    }
}
