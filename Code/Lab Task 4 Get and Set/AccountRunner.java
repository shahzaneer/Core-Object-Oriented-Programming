public class AccountRunner {

    public static void main(String[] args) {
        
        Account a1 = new Account(500);
        Account a2 = new Account(a1.getBalance());

        // System.out.println(a1.depositMoney(-888)); 

        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());


    }
    
    
    
}
