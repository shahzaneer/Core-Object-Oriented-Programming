public class Vehicle {
    private String manufacturerName;
    private int cylindersInEngine;
    private Person person;

    public Vehicle(){
        person = new Person(); // takay null na jaye wahan! 
        // has a relationship ki example !
    }

    public Vehicle(String manufacturerName , int cylindersInEngine, Person person){
        this.manufacturerName = manufacturerName;
        this.cylindersInEngine = cylindersInEngine;
        this.person = person;

    }

    public void setManufacturerName(String manufacturerName){
        this.manufacturerName = manufacturerName;
    }

    public void setCylindersInEngine(int cylindersInEngine){
        this.cylindersInEngine = cylindersInEngine;
    }

    public void setPerson(Person p){
        this.person = p;
    }

    public String getManufacturerName(){
        return this.manufacturerName;
    }

    public int getCylindersInEngine(){
        return this.cylindersInEngine;
    }

    public Person getPerson(){
        return this.person;
    }


    public void display(){
        this.getPerson().display();
        System.out.println(this.manufacturerName);
        System.out.println(this.cylindersInEngine);
    }
}
