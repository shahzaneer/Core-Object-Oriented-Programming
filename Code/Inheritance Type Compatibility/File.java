public class File extends Document {
    private String pathname;

    // Constructors
    public File(){
        super();
    }

    public File(String text , String pathname){
        super(text);
        this.pathname = pathname;
    }

    // setter
    public void setPathName(String pathname){
        this.pathname = pathname;
    }

    // getter
    public String getPathName(){
        return this.pathname;
    }

    // toString
    @Override
    public String toString(){
        return super.toString()+ "" + this.pathname;
    }
}
