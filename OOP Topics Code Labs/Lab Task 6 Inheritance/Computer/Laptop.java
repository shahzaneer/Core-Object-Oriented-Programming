import javax.management.ConstructorParameters;

public class Laptop extends Computer{
    private double  length;
    private double width;
    private double height;
    private double weight;
    
    public Laptop(){
        super(); // yeh na bhi den tou by default compiler daal deta hai

    }
    
    public Laptop(int ws, int ms , int ss, double sp, double l , double w, double h, double weight ){
        super(ws,ms,ss,sp);
        // super first line main hi hona chahiay werna yeh error dega
        this.length = l;
        this.width = w;
        this.height = h;
        this.weight = weight;

    }

    @Override //annotations -> it describes how a function is going to behave
    public void display(){
        super.display();
        System.out.println(this.height);
        System.out.println(this.length);
        System.out.println(this.width);
        System.out.println(this.weight);


    }

}