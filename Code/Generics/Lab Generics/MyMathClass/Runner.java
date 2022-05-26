import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
            // Making three arrays of Number Class Descendants
            ArrayList <Integer> a1 = new ArrayList<>();
            ArrayList <Double> a2 = new ArrayList<>();
            ArrayList<Float> a3 = new ArrayList<>();
            ArrayList<String> a4 = new ArrayList<>();
            
            a1.add(10);
            a1.add(11);
            a1.add(12);
            a1.add(13);
            a1.add(15);

            a2.add(1.5);
            a2.add(2.743225);
            a2.add(4.6532);
            a2.add(54.8643);
            a2.add(99.9999);

            a3.add(1.1f);
            a3.add(15.0f);
            a3.add(11.65f);
            a3.add(10.32f);
            a3.add(9.31f);

            a4.add("Shah");
            a4.add("Laiba");
            a4.add("Raheem");
            a4.add("Anas");
            a4.add("Rabbiya");

            // Calculating Standard Deviation for each Arraylist
            MyMathClass <Integer> m1 = new MyMathClass<>();
            MyMathClass <Double> m2 = new MyMathClass<>();
            MyMathClass<Float> m3 = new MyMathClass<>();


            
            // MyMathClass<String> m4 = new MyMathClass<>(); // compiler will complain String is not the descendent of Numbers

            MyMathClass<Number> m4 = new MyMathClass<>();

            // m4.getStandardDeviation(a4); complaining compiler will throw error!
            
            System.out.println(m1.getStandardDeviation(a1));
            System.out.println(m2.getStandardDeviation(a2));
            System.out.println(m3.getStandardDeviation(a3));
            





            
        }
    }

