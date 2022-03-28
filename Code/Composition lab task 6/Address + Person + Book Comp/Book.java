public class Book {
    private Person author;
    private String bookName;
    private String publisher;

    // default constructor
    public Book(){
        author = new Person(); 
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
            return true;
        }
        return false;
    }

}
