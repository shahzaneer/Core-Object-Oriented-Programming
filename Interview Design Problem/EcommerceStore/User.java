public class User  {
    static int idCounter = 0;
    String id;
    String name;
    boolean isLoggedIn = false;


    User(String name){
        this.id = ++idCounter  + "";
        this.name = name;
        System.out.println("ID :" + this.id + " Name : " + this.name);
    }

    public boolean login(String id, String name){
        if((id == null ? this.id == null : id.equals(this.id)) && (name == null ? this.name == null : name.equals(this.name))) isLoggedIn = true;
        return isLoggedIn;
    }
}
