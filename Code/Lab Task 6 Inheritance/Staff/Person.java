public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(){

    }

    public Person(String name, String address, String phoneNumber , String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // setters 
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmailAddress(String emailAdrress){
        this.emailAddress = emailAdrress;
    }

    // getters
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }

    // display
    public void display(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.phoneNumber);
        System.out.println(this.emailAddress);
    }


}
