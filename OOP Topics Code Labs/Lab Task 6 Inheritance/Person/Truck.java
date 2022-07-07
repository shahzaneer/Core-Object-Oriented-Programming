public class Truck extends Vehicle{
    private double loadCapacity;
    private int towingCapacity;

    public Truck(){
        super();
    }

    public Truck(String manufacturerName , int cylindersInEngine , Person person , double loadCapacity , int towingCapacity){
        super(manufacturerName, cylindersInEngine, person);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public void setLoadCapacity(double loadCapacity){
        this.loadCapacity = loadCapacity;
    }

    public void setTowingCapacity(int towingCapacity){
        this.towingCapacity = towingCapacity;
    }

    public double getLoadCapacity(){
        return this.loadCapacity;
    }
    public int getTowingCapacity(){
        return this.towingCapacity;
    }

    @Override
    public void display(){
        super.display();
        // this.display(); this will be wrong as it will point to its own display function 
        // as usually happens in recursion !
        System.out.println("The loading capacity is "+loadCapacity);
        System.out.println("The towing capacity is "+towingCapacity);
        
    }
}
