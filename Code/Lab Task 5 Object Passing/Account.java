public class Account {
    private double balance;
    private int yearOfOpening;
    private String cnic;

    public void setBalance(double balance){
        if(balance>=0){
            this.balance = balance;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setCnic(String cnic){
        this.cnic = cnic;
    }
    public String getCnic(){
        return this.cnic;
    }

    public void setYearOfOpening(int yearOfOpening){
        this.yearOfOpening = yearOfOpening;
    }
    public int getYearOfOpening(){
        return this.yearOfOpening;
    }

    public Account(){

    }

    public Account(double balance){
        if(balance>=0){
            this.balance = balance;
        }

    }

    // Three Arguments Constructor
    public Account(double balance , int yearOfOpening , String cnic){
        if(balance>=0){
            this.balance = balance;
        }
        if(yearOfOpening>0){
            this.yearOfOpening = yearOfOpening;
        }
        this.cnic = cnic;
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


    //! this is wrong approach as hamain kisi dusre object uska cnic check nhi krna 
    //! hamara saara kaam current object se related hona chahiay 
    // boolean checkValidCnic(Account a){
    //     if(a.cnic.length()==13){
    //         return true;
    //     }
    //     return false;
    // }

    

    // new work for today's lab
    public Account(Account a){
        this.balance = a.balance;
        this.cnic = a.cnic;
        this.yearOfOpening = a.yearOfOpening;
    }

    public boolean checkValidCnic(){
        if(cnic.length()==13){
            return true;
        }
        return false;
    }

    public boolean equalContents(Account a){
        if((this.balance == a.balance) && (this.yearOfOpening == a.yearOfOpening) && (this.cnic.equals(a.cnic))){
            return true;
        }
        return false;
    }



    
}
