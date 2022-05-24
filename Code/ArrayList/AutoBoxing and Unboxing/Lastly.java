import java.util.ArrayList;

// 3.	Create an array List of any wrapper class.
// Add 5 objects and explore the concept of autoboxing and unboxing

public class Lastly {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<>();

        //Dynamic part main <> generic specifically mention karen na karen koi masla nhi hota
        // * generics compile time per resolve houtay hain
        
        names.add("Shahzaneer Ahmed");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        numbers.add(96);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

    }
}

