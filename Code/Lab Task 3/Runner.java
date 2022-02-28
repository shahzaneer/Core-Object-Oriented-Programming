public class Runner{
    public static void main(String[] args) {
        // * Account class 
        // Account a1 = new Account();
        // a1.setValues(2012, 50,"35202-7469818-1");
        // a1.display();
        // double paisa = a1.deposit(20);
        // System.out.println(paisa);
        // double moneyAfterWithdrawal = a1.withdraw(17);

        // System.out.println(moneyAfterWithdrawal);
        // System.out.println(a1.balance);

        // * Book Class
        // Book b1 = new Book();
        // String [] chapters = {"Research","Ideas","Innovation","Implementation","Modification"};
        // b1.setValues("Shahzaneer Ahmed",chapters);
        // System.out.println(b1.author);
        // b1.display();

        // * Rectangle Class
        // Rectangle r1 = new Rectangle(12, 12);
        // System.out.println(r1.checkSquare());
        // r1.display();
        // System.out.println(r1.area()); 

        // * Quadratic Equation Class
        // QuadraticEquation q1 = new QuadraticEquation(2,3,4);
        // System.out.println(q1.discriminant()); 
        // q1.display();
        // System.out.println(q1.discGreaterThan100());

        // * Student Class
        Student s1 = new Student();
        String [] courses = {"ICT","PF","DSA","OOP","Database-1"};
        s1.setValues("Eman",3.3,courses,"emann01@gmail.com");
        System.out.println(s1.checkProbStatus());
        s1.display();
        System.out.println(s1.validEmail());
        
        

    }
}