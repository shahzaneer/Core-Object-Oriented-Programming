
public class NormalUser extends User{

    NormalUser(String name){
        super(name);
    }

    public void buy(String itemName, EcommerceStore es){
        if(this.isLoggedIn){
            for(int i=0; i<es.getVendors().size(); i++){
                Vendor currentVendor = es.getVendors().get(i);
                for(int j=0; j<currentVendor.getItems().size(); j++){
                    Item currentItem = currentVendor.getItems().get(j);
                    if(currentItem.getItemName().equals(itemName) && currentItem.getItemStock() != 0){
                        System.out.println("you bought the item");
                        if(currentItem.getItemStock() != 0)
                        currentItem.setItemStock(currentItem.getItemStock() - 1); 
                    }  
                }
            }
     
        }

        else System.out.println("Kindly Log in first");
    }

    public void viewAll(EcommerceStore es){
        for(int i=0; i<es.getVendors().size(); i++){
            Vendor currentVendor = es.getVendors().get(i);
            for(int j=0; j<currentVendor.getItems().size(); j++){
                Item currentItem = currentVendor.getItems().get(j);
                    System.out.println(currentItem);                 
            }
        }
    }

    public void viewSpecific(String itemName, EcommerceStore es){
        for(int i=0; i<es.getVendors().size(); i++){
            Vendor currentVendor = es.getVendors().get(i);
            for(int j=0; j<currentVendor.getItems().size(); j++){
                Item currentItem = currentVendor.getItems().get(j);
                if(currentItem.getItemName().equals(itemName) && currentItem.getItemStock() != 0){
                    System.out.println(currentItem);  
                    break;        
                }
                  
            }
        }
   
    }

    public void allItemFromAVendor(EcommerceStore es, Vendor vendor){
        for(int i=0; i<es.getVendors().size(); i++){
            Vendor currentVendor = es.getVendors().get(i);
            if(currentVendor == vendor){
                for(int j=0; j<currentVendor.getItems().size(); j++){
                    Item currentItem = currentVendor.getItems().get(j);
                    System.out.println(currentItem);
                }
                break;
            }
            
        }
    }

    public void getItemDetails(EcommerceStore es, String id){
        for(int i=0; i<es.getVendors().size(); i++){
            Vendor currentVendor = es.getVendors().get(i);
            for(int j=0; j<currentVendor.getItems().size(); j++){
                Item currentItem = currentVendor.getItems().get(j);
                if(currentItem.getId().equals(id) && currentItem.getItemStock() != 0){
                    System.out.println(currentItem);
                    break;          
                }
                  
            }
        }
    }
}
