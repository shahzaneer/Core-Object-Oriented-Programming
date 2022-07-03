public class Runner {
    public static void main(String[] args) {
        // Parent reference var main child ka object 
        Parent p = new Child(); // upcasting

        Child c = (Child) new Parent(); // downcasting

        // object main kia kia visible hoga iski determination left hand side se hoti hai
        // reference Type V = new ObjectType();
        // Reference main jo hoga wohi visible hoga!
    }
}
