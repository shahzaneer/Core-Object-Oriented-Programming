public class RUNNER {
    public static void main(String[] args) {
        // Name n1 = new Name("Shahzaneer ");
        // System.out.println(n1); //object is not printing the default Hashcode 
        // Instead it is printing the toString Method

        // Without the creation of object still you can use the static variables

        // Static stuff is resolved during compile time
        System.out.println(Name.number);
    }
}
