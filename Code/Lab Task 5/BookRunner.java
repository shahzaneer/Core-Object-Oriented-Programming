public class BookRunner {

    public static void main(String[] args) {
        Book b1 = new Book("Shahzaneer Ahmed",new String [] {"Languages","primitives","paradigms","ABC","ABC"});
        Book b2 = new Book("Shahzaneer Ahmed",new String [] {"Languages","primitives","paradigms","ABC","ABC"});
        System.out.println(b1.equalContents(b2));

    }
    

    
    
}
