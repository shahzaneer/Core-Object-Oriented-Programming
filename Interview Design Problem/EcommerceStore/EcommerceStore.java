import java.util.ArrayList;

public class EcommerceStore {
    private ArrayList<Vendor> vendors;
    private ArrayList<NormalUser> normalUsers;
    private ArrayList<Admin> admins;
    private ArrayList<StoreManager> storeManagers;

        public void setVendors(ArrayList<Vendor> vendors) {
            this.vendors = vendors;
        }

        public ArrayList<Vendor> getVendors() {
            return this.vendors;
        }
        
        public void setNormalUsers(ArrayList<NormalUser> normalUsers) {
            this.normalUsers = normalUsers;
        }

        public ArrayList<NormalUser> getNormalUsers() {
            return this.normalUsers;
        }
        
        public void setAdmins(ArrayList<Admin> admins) {
            this.admins = admins;
        }

        public ArrayList<Admin> getAdmins() {
            return this.admins;
        }
        
        public void setStoreManagers(ArrayList<StoreManager> storeManagers) {
            this.storeManagers = storeManagers;
        }

        public ArrayList<StoreManager> getStoreManagers() {
            return this.storeManagers;
        }
        
        
    
}
