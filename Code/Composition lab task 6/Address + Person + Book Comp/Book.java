public class Book {
    private Person author;
    private String bookName;
    private String publisher;

    // default constructor
    public Book(){
        author = new Person(); //! yeh jo hai yeh forcibly initialized krwaya gya hai
        // to get the rid of null pointer exception
    }
    // overloaded constructor.
    public Book(Person author , String bookName , String publisher){
        this.author = author;
        this.bookName = bookName;
        this.publisher = publisher;
    }

    public void display(){
        this.author.display();
        System.out.println(this.bookName);
        System.out.println(this.publisher);
    }
    public void getDisplay(){
        System.out.println(this.author.getFirstName());
        System.out.println(this.author.getLastName());
        System.out.println(this.author.getAddress().getHome());
        System.out.println(this.author.getAddress().getStreet());
        System.out.println(this.author.getAddress().getCity());
        System.out.println(this.bookName);
        System.out.println(this.publisher);

    }

    public boolean homeNumber(){
        if(this.author.getAddress().getHome() == 10){
            return true; //Guard if condition
        }
        return false;
    }

    public void modifyStreet(String currentStreet){
        this.author.getAddress().setStreet(currentStreet);
    }

}



//TODO:  Guard if --> it is a decision making technique that is based on the early exit condition from the if-else structure.

