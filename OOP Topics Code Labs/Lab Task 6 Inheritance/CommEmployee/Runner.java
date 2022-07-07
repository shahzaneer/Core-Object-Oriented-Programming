public class Runner {
    public static void main(String[] args) {
        BasePlusCommEmployee emp1 = new BasePlusCommEmployee("Shahzaneer","Ahmed",450.0,300,3456,9000);
        emp1.display(); //emp1 ki body main jo earnings hain wo return hua hai!
        System.out.println(emp1.earnings()); 
    }
}
