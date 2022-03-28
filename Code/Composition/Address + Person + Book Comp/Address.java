
public class Address{    
    private int home;
    private String street;
    private String city;

    public int getHome(){
        return home;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    public void setHome(int h){
        this.home = h;
    }
    public void setStreet(String s){
        this.street = s;
    }
    public void setCity(String c){
        this.city = c;
    }

    public Address(){
        // is see Address k non primitive data members ki by default values set hojayengi.
    }
    public Address(int h , String s, String c){
        this.home = h;
        this.street = s;
        this.city = c;

    }
    

    


}