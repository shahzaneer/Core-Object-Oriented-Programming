package Code.Inheritance.SingleLevel;
public class CommEmployee {
    protected String firstName;
    protected String lastName;
    protected double grossSale;
    protected double commRate;
    
    public CommEmployee(){
        // super constructor
    }
    public CommEmployee(String firstName , String lastName , double grossSale, double commRate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grossSale = grossSale;
        this.commRate = commRate;
    }

    public double earnings(){
        return grossSale*commRate;
    }

    public void display(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.grossSale);
        System.out.println(this.commRate);
    }
}

