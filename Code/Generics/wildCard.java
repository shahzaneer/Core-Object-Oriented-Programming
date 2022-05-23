import java.util.ArrayList;

public class wildCard{

    public static void main(String[] args) {
        ArrayList abc = new ArrayList<>();
        abc.add("Shahzaneer Ahmed");
        abc.add(12);
        abc.add(12.98);
        abc.add(new Contact("Shahzaneer", "Ahmed", "03164606490", "shahzaneer.dev@gmail.com"));

        


        
        for (int i = 0; i < abc.size(); i++) {
            // System.out.println(abc.get(i));
            // abc.get(i).
            // ! When no type is specified it is being treated as Object class's Object 

        }

        // Wild Card 
        
        ArrayList<? extends Contact> abd = new ArrayList<>();
        // It means Contact aur contact k childs sb aaske hain yahan

    }
}
