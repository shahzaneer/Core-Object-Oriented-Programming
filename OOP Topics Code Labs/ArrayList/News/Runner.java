import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<News> news = new ArrayList<News>();
        news.add(new News(12, "Kamran Khan", "Pakistan is on the verge of bankrupcy"));
        news.add(new News(123, "Rameez Kashif", "Flutter making beautliful UI's"));
        news.add(new News(134, "Ali", "PM IK's Long March"));

        for (int i = 0; i < news.size(); i++) {
            // System.out.println(news.get(i).toString());
            if (news.get(i).getNewsEditor().equalsIgnoreCase("Ali")) {
                System.out.println(news.get(i).toString());
            }

            if (news.get(i).getNewsID() == 123) {
                news.remove(i);
            }
        }
        
        for (int i = 0; i < news.size(); i++) {
             // Printing after removal
                System.out.println(news.get(i).toString());

        }


    }

    
    
    

    
}
