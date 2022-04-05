public class BasePlusCommEmployee extends CommEmployee{
    private double basicSalary;

    public BasePlusCommEmployee(){
        super();
    }
    public BasePlusCommEmployee(String firstName , String lastName,double grossSale,double commRate,double basicSalary){
        super(firstName, lastName, grossSale, commRate);
        this.basicSalary = basicSalary;
    }

    public void display(){
        super.display();
        System.out.println(this.basicSalary);
    }
}
