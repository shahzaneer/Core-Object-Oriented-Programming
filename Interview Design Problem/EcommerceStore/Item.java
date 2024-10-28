
public class Item {

    static int itemIDCounter = 0;
    private String id;
    private String itemName;
    private String description;
    private int itemStock;

    public Item(String itemName, String description, int itemStock){
        this.id = itemIDCounter++ + "";
        this.itemName = itemName;
        this.description = description;
        this.itemStock = itemStock;
    }

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }
        
        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getItemName() {
            return this.itemName;
        }
        
        public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }

        public int getItemStock(){
            return this.itemStock;
        }

        public void setItemStock(int itemStock){
            this.itemStock = itemStock;
        }

    @Override 
    public String toString(){
        return "ID :" + this.id + "ItemName :" + this.itemName + "Description :" + this.description;
     }
        
    
}
