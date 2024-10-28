public class Admin extends StoreManager{
    public Admin(String name){
        super(name);
    }

    public User addNewUser(String name){
        if(this.isLoggedIn){
            User user = new NormalUser(name);
            return user;
        }
        else{
            System.out.println("Kindly log in to the system");
            return null;
        }
    }

    public void addNewVendor(EcommerceStore es, Vendor vendor){
        if(this.isLoggedIn)
            es.getVendors().add(vendor);
        else System.out.println("Kindly log into the system");    
    }

}
