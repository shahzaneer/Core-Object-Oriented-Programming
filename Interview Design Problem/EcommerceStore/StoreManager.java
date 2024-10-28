
import java.util.ArrayList;

public class StoreManager extends NormalUser{
    StoreManager(String name){
        super(name);
    }

    public void addItemsToVendors(EcommerceStore ec, Vendor vendor, ArrayList<Item> item){
        if(this.isLoggedIn){
            for(int i=0; i<ec.getVendors().size(); i++){
                Vendor currentVendor = ec.getVendors().get(i);
                if(currentVendor == vendor){
                    int itemCount = item.size();
                    while(itemCount >= 0){
                        currentVendor.getItems().add(item.get(itemCount));
                        itemCount--;
                    }
                }
            }
        }
        else System.out.println("Kindly log in first");
       
    }
}

