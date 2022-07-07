
public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    public Person(){
        // no Args Constructor
        this.address = new Address();
    }

    public Person(String fname ,String lname,Address address){
        this.firstName = fname;
        this.lastName = lname;
        this.address = address;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public Address getAddress(){
        return address;
    }

    public void setFirstName(String fname){
        this.firstName = fname;
    }
    public void setLastName(String lname){
        this.lastName = lname;
    }
    public void setAddress(Address address){
        this.address = address;
    }

    public void display(){
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.address.getHome() + " " + this.address.getStreet() + " " + this.address.getCity());
    }

    public boolean checkCapital(){
        if(this.address.getCity().equalsIgnoreCase("Islamabad")){
            return true;
        }
        return false;
    }

}
