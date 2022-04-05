public class CommEmployee {
    protected String firstName;
    protected String lastName;
    protected double grossSale;
    protected double commRate;
    protected double SSN;
    
    public CommEmployee(){
        // super constructor
    }
    public CommEmployee(String firstName , String lastName , double grossSale, double commRate , double SNN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grossSale = grossSale;
        this.commRate = commRate;
        this.SSN = SNN;
    }

    public double earnings(){
        return grossSale*commRate;
    }

    public void display(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.grossSale);
        System.out.println(this.commRate);
        System.out.println(this.SSN);
    }
}

