import java.util.ArrayList;

public class Shop {
    private String shopName;

    private ArrayList <Object> items = new ArrayList<>();

    public Shop() {
    }

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void addItemToShop(Object item) {
        if (item != null) {
            this.items.add(item);
        }
    }

    public void deleteItemFromShop(Object item) {
        for (int i = 0; i < items.size(); i++) {
            if (this.items.get(i) == item && item!= null) {
                items.remove(i);
            }
        }
    }
    
    public void displayAvailableItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(this.items.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return "{" +
            " shopName='" + getShopName() + "'" +
            "}";
    }


}