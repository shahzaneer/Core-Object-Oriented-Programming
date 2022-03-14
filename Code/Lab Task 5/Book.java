public class Book {
    private String author;
    private String [] chapters = new String [5];

    public void setauthor(String author){
        this.author = author;
    }
    public void setChapters(String [] chapters){
        for(int i=0;i<5;i++){
    
                this.chapters[i] = chapters[i];
        }
    }

    public String getauthor(){
        return author;
    }
    public String [] getchapters(){
        return chapters;
    }

    public Book(){

    }

    public Book(String author , String [] chapters){
        this.author = author;
        for(int i=0;i<5;i++){
            this.chapters[i] = chapters[i];
        }

    }

    public Book(Book b){
        this.author = b.author;
        for(int i=0;i<5;i++){
            this.chapters[i] = b.chapters[i];
        }


    }

    public boolean compareAuthors(Book b){
        if(b.author.equals(this.author)){
            return true;
        }
        return false;
    }

    public boolean compareChapters(Book b){

        for(int i=0;i<b.chapters.length;i++){
            if(b.chapters[i]!=this.chapters[i]){
                return false;
            }
        }
        
        return true;
    }

    public boolean equalContents(Book b){
        boolean chapterE = false,AuthorE = false;
        for(int i=0;i<b.chapters.length;i++){
            if(b.chapters[i]!=this.chapters[i]){
                chapterE = false;
            }
            else chapterE = true;
        }

        if(this.author == b.author){
            AuthorE = true;
        }

        if(chapterE && AuthorE){
            return true;
        }

        return false;

    }

    
}