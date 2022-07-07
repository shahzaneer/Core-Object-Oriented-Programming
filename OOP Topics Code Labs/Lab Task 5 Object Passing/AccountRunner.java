public class AccountRunner {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setBalance(12000);
        a1.setYearOfOpening(2022);
        a1.setCnic("3520274698181");

        Account a2 = new Account();
        a2.setBalance(12000);
        a2.setYearOfOpening(2022);
        a2.setCnic("352027469818");


        // !this is wrong approach as koi bhi method aik object k liay chalta hai 
        // System.out.println(a1.checkValidCnic(a2));
        
        System.out.println(a1.checkValidCnic());
    }
}
