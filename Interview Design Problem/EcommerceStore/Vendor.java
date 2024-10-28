import java.util.ArrayList;

public class Vendor {
    static int vendorCounter = 0;
    private String id;
    private String name;
    private ArrayList<Item> items;

        public Vendor(String name, ArrayList<Item> items){
            this.id = vendorCounter++ + "";
            this.name = name;
            this.items = items;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }
        
        public void setItems(ArrayList<Item> items) {
            this.items = items;
        }

        public ArrayList<Item> getItems() {
            return this.items;
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        } 

    
}
