import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;

// 3.	Create an array List of any wrapper class.
// Add 5 objects and explore the concept of autoboxing and unboxing


        //! Unboxing

        // Converting an object of a wrapper type (Integer) to its 
        // corresponding primitive (int) value is called unboxing. 

        // !Autoboxing

        // Autoboxing is the automatic conversion that 
        // the Java compiler makes between the primitive types
        // and their corresponding object wrapper classes. 
        // For example, converting an int to an Integer, a double to a Double, and so on.


public class Lastly {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<>();

        //Dynamic part main <> generic specifically mention karen na karen koi masla nhi hota
        // * generics compile time per resolve houtay hain

        names.add("Shahzaneer Ahmed");
        names.add("Laiba Imran");
        names.add("Rabbiya Tabassum");
        names.add("Raheem Arif");

        // Normal looping 
        // for (int i = 0; i < names.size(); i++) {
        //     System.out.println(names.get(i));
        // }

        // normal way which should be used
        // numbers.add(new Integer(6));
        //      auto boxing
        numbers.add(96);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            System.out.println(numbers.get(i).getClass().getSimpleName());
        }

        //     This is user defined boxing
        int a = 56;
        System.out.println(((Object) a).getClass().getSimpleName());

        for (String n : names) {
            System.out.println(n);
        }


        System.out.println(numbers.get(0).getClass()); // if it comes out to be an object (Integer) then our concept of autoboxing will be true >>
        // yani mene aik int dya aur usko automatically Integer main convert krdia gya (autoboxing)

        // System.out.println((int) (numbers.get(0) instanceof int)); // unboxing

    }
}

