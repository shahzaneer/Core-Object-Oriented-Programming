public class Document {
    private String text;

    // setter
    public void setText(String text){
        this.text = text;
    }

    // getter
    public String getText(){
        return this.text;
    }
    // Constructors
    public Document(){}
    public Document(String text){
        this.text = text;
    }

    // toString
    @Override
    public String toString(){
        return text;
    }
}
