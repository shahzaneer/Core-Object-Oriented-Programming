public class Publication {
    private String title;
    private double price;

    // Constructors 
    
    // 1 . Default
    public Publication(){

    }

    // 2. Parameterized
    public Publication(String title , double price){
        this. title = title;
        this.price = price;
    }

    // setters

    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(double price){
        this.price = price;
    }

    // getters

    public String getTitle(){
        return this.title;
    }
    public double getPrice(){
        return this.price;
    }

    public void display(){
        System.out.println(this.title);
        System.out.println(this.price);
    }
}
