public class Account {
    private double balance;

    public void setBalance(double balance){
        if(balance>=0){
            this.balance = balance;
        }
    }

    public double getBalance(){
        return balance;
    }

    public Account(){

    }

    public Account(double balance){
        if(balance>=0){
            this.balance = balance;
        }

    }

    public double withdrawMoney( double withdrawingMoney){
        if(withdrawingMoney>=0 && (balance>=withdrawingMoney)){
            System.out.println("The current Balance after withdrawal is "+(balance-withdrawingMoney));
            balance = balance - withdrawingMoney;  
            return withdrawingMoney;

        }
        System.out.println("The withdrawal amount cannot be negative or greater than the balance");
        return 0;

    }

    public double depositMoney(double depositAmount){
        if(depositAmount>0){
            System.out.println("The current Balance after Deposit is "+(balance+depositAmount));
            balance = balance + depositAmount;
            return depositAmount;
        }
        System.out.println("The deposited amount cannot be negative");
        return 0;


    }


    
}
