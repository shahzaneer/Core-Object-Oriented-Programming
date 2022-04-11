public class Email extends Document {
    private String recepient,title,sender;

    // Constructors

    public Email(){
        super();
    }

    public Email(String text , String recepient , String title , String sender){
        super(text);
        this.sender = sender;
        this.recepient = recepient;
        this.title = title;
    }

    // toString
    @Override
    public String toString(){
        return String.format("%s\n%s\n\t%s\n%s", recepient,title,super.getText(),sender);
    }
    

}
