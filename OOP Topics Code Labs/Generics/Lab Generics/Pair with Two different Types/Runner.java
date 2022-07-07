public class Runner {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<Integer, String>(1, "one");
        Pair<Double, Boolean> pair2 = new Pair<>(2.4,true);
        Pair<String, Double> pair3 = new Pair<>("Shahzaneer Ahmed - Data Scientist",10.0);
        Pair<Character, Student> pair4 = new Pair<>('A',new Student("Abdur Rehman", 2));
        // These types should not be the primitives but be the the wrapper classes


        System.out.println(pair);
        System.out.println(pair2);
        System.out.println(pair3);
        System.out.println(pair4);
        
        
    }
}
