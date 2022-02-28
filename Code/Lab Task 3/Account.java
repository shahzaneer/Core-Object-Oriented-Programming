public class Account{
    int yearOfOpening;
    double balance;
    String cnic;

    Account(){
//  default constructor

    }
    Account(double bal){
        balance = bal;
    }
    Account(int year,double bal,String nic){
        yearOfOpening = year;
        balance = bal;
        cnic= nic;
    }

    void setValues(int year,double bal,String nic){
        yearOfOpening = year;
        balance = bal;
        cnic= nic;
    }

    void display(){
        System.out.println("The year of opening is "+yearOfOpening);
        System.out.println("The current balance is "+balance);
        System.out.println("The CNIC is "+cnic);
    }

    double withdraw(double withdrawalMoney){
        if(withdrawalMoney<0){
            System.out.println("You cannot enter negative withdrawal ammount");
            return balance;
        }
        else{
            return balance = balance - withdrawalMoney;
        }
    }

    double deposit(double depositMoney){
        if(depositMoney<0){
            System.out.println("You cannot enter negative deposit money ");
            return balance;
        }
        else{
            return depositMoney;
        }
    }

    int ageOfAccount(int currentYear){
        return currentYear - yearOfOpening;
    }
}