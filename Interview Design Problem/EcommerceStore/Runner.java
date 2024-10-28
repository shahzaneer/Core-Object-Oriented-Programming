import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        EcommerceStore shahStore = new EcommerceStore();
        Item item1 = new Item("cocaCola", "coldDrink", 100);
        Item item2 = new Item("sprite", "coldDrink", 100);

        ArrayList<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        Vendor coldDrinkVendor = new Vendor("shamsi", items);
        ArrayList<Vendor> vendors = new ArrayList<>();
        vendors.add(coldDrinkVendor);
        shahStore.setVendors(vendors);

        Admin superAdmin = new Admin("Shahzaneer");
        ArrayList<Admin> admins = new ArrayList<>();
        shahStore.setAdmins(admins);

        superAdmin.getItemDetails(shahStore, "1");
        superAdmin.login("1", "Shahzaneer");
        superAdmin.buy("sprite", shahStore);
    }
}
