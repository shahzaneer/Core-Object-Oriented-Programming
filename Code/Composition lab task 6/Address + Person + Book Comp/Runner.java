
public class Runner{
    public static void main(String[] args) {
        Address a1 = new Address(34,"NIH Colony","Islamabad");
        Person p1 = new Person("Shahzaneer", "Ahmed", a1);
        // p1.display();
        // System.out.println(p1.checkCapital());
        Book b1 = new Book(p1, "Raah e Zeest", "Dogar publishers");

        b1.display();
    System.out.println(b1.homeNumber()); // home number 34 hai tou false dega
    // a1.setHome(10); // now home is 10!
    b1.getDisplay();
    b1.display();  // info is modified!
    System.out.println(b1.homeNumber());
    }
}
