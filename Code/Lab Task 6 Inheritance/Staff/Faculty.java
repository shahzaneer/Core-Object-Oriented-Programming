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

    @Override
    public void display(){
        super.display();
        System.out.println("Office Hours "+this.officeHours);
        System.out.println("Rank "+this.rank);
    }
}
