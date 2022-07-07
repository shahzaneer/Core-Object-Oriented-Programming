public class Runner {
    public static void main(String[] args) {
        NameCollection nc = new NameCollection(
                new String[] { "Shahzaneer Ahmed", "Raheem Arif", "Laiba Imran", "Fawad Awan", "Sameem Amjad",
                        "Rabbiya Tabassum", "Nimra Malik", "Haider Ali", "Rameez Kashif", "Muhammad Hamza" });
        // System.out.println(nc.toString()); 
        for (int i = 0; i < nc.names.length; i++) {
            System.out.println(nc.getNext(i));
            // String is also an object
            // by printing String object we get the original String!
        }
        
    }
}
