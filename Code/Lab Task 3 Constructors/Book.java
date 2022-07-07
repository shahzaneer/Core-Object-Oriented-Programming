public class Book {
    String author;
    String [] chapters = new String [5];
    
    Book(){

    }
    Book(String auth,String []chap){
        author = auth;
        for(int i=0; i<chap.length;i++){
            chapters[i] = chap[i];
        }
    }
    void display(){
        System.out.println("The Author's name is "+author);
        System.out.println("The chapters are ");
        for(int i=0;i<chapters.length;i++){
            System.out.printf("Chapter no %d is : ",(i+1));
            System.out.println(chapters[i]);
        }
    }
        void setValues(String auth,String []chap){
            author = auth;
            for(int i=0; i<chap.length;i++){
                chapters[i] = chap[i];
        }
    }

        boolean checkAuthorName(){
            if(author.startsWith("A")){
                return true;
            }
            else{
                return false;
            }
        }

        boolean searchChapter(String chapterName){
            for(int i=0;i<chapters.length;i++){
                if(chapterName.equalsIgnoreCase(chapters[i])){
                    return true;
                }
                
            }
            return false;

        }
    }

