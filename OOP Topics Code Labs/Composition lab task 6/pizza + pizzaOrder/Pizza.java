public class Pizza{
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    // Default Constructor
    public Pizza(){} 

    // Parametrized Constructor
    public Pizza(String size , int cheeseToppings,int pepperoniToppings, int hamToppings){
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    // getters
    public String getSize(){
        return this.size;
    }
    public int getPepperoniToppings(){
        return this.pepperoniToppings;
    }
    public int getCheeseToppings(){
        return this.cheeseToppings;
    }
    public int getHamToppings(){
        return this.hamToppings;
    }

    // setters

    public void setSize(String size){
        this.size = size;
    }
    public void setCheeseToppings(int ct){
        this.cheeseToppings = ct;
    }
    public void setPepperoniToppings(int ppt){
        this.pepperoniToppings = ppt;
    }
    public void setHamToppings(int ht){
        this.hamToppings = ht;
    }

    public double calcCost(){
        double cost = 0;
        // size
        if(size.equalsIgnoreCase("small")) cost+=10;
        else if(size.equalsIgnoreCase("medium")) cost+=12;
        else if(size.equalsIgnoreCase("large")) cost+=14;
        cost+= cheeseToppings*2+hamToppings*2+2*pepperoniToppings;
        
        return cost;
    }

    public void getDescription(){
        System.out.println("The Size of Pizza is "+this.getSize());
        System.out.println("The Numbers of Cheese Toppings are "+this.getCheeseToppings());
        System.out.println("The Numbers of pepperoni Toppings are "+this.getPepperoniToppings());
        System.out.println("The Number of Ham Toppings are "+this.getHamToppings());
        System.out.println("The cost of pizza is "+this.calcCost());
    }


}