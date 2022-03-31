public class PizzaOrder {
    private Pizza p1;
    private Pizza p2;
    private Pizza p3; 

    // Default Constructor 

    public PizzaOrder(){}

//  Parametrized Constructor 

    public PizzaOrder(Pizza p1, Pizza p2 , Pizza p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    // setMethods
    public void setPizza1(Pizza p1){
        this.p1 = p1;
    }
    public void setPizza2(Pizza p2){
        this.p2 = p2;
    }   
    public void setPizza3(Pizza p3){
        this.p3 = p3;
    }

    // getters 

    public Pizza getPizza1(){
        return this.p1;
    }
    public Pizza getPizza2(){
        return this.p2;
    }
    public Pizza getPizza3(){
        return this.p3;
    }

    public double calcTotal(){
        // ismay humne null check kia hai cause object ki default type hoti hai NULL
        // aur humne constructor main forcibly initialzed nhi kia koi object.
        double total = 0;
        if(p1!=null){
            total += this.p1.calcCost();
        }
        if(p2!=null){
            total+=this.p2.calcCost();
        }
        if(p3!=null){
            total+=this.p3.calcCost();
        }

        return total;
    }
}
