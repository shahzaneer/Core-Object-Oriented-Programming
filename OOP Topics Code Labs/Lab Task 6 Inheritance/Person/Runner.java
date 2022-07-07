public class Runner {
    public static void main(String[] args) {
        Person p1 = new Person("Muhammad Iqbal", 56); //Subpart
        Truck t = new Truck("Toyota", 4, p1, 3, 1); //whole + single level inheritance 
        t.display();

        // has a relationship + is a relationship --> in a nutshell!
    }
}
