public class Runner {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("Hello", "World");
        Pair<Integer> pair2 = new Pair<>(1, 2);
        Pair<Double> pair3 = new Pair<>(1.0, 2.0);
        Pair<Boolean> pair4 = new Pair<>(true, false);
        Pair<Character> pair5 = new Pair<>('a', 'b');

        System.out.println(pair);
        System.out.println(pair2);
        System.out.println(pair3);
        System.out.println(pair4);
        System.out.println(pair5);
    }    
}
