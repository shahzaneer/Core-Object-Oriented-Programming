public class BasePlusCommEmployee extends CommEmployee{
    private double basicSalary;

    public BasePlusCommEmployee(){
        super();
    }
    public BasePlusCommEmployee(String firstName , String lastName,double grossSale,double commRate,double SNN, double basicSalary){
        super(firstName, lastName, grossSale, commRate,SNN);
        this.basicSalary = basicSalary;
    }

    @Override
    public double earnings(){
        return basicSalary + super.earnings();
    }

    public void display(){
        super.display();
        System.out.println(this.basicSalary);
    }
}
