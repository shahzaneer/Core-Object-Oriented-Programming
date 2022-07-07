public class Runner {
    public static void main(String[] args) {

        Movie movies[] = new Movie[3];
        movies[0] = new Action(23, "survival of the fittest", 22);
        movies[1] = new Drama(21, "Ehd e wafa", 100);
        movies[2] = new Comedy(1, "Pakistani democrary", 500);

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Before Downcasting");

            System.out.println(movies[i].toString());
            System.out.println(movies[i].calcLateFee());

            // todo: Reset numberID for action:Movie
            if (movies[i] instanceof Action) {
                Action newM1 = (Action) movies[i];
                newM1.setNumberID(2);
                movies[i] = newM1;
            }

            System.out.println("After DownCasting ");

            System.out.println(movies[i].toString());
            System.out.println(movies[i].calcLateFee());

        }

        // 
        // System.out.println(movies[0].equals(movies[2]));
        // System.out.println(movies[0].equals(movies[2]));
        
        if (movies[0].getClass() == movies[2].getClass()) {
            System.out.println("Types are same");
            // yeh isliay nhi chala q k polymorphic call hamesha return late binding se hoti hai aur late binding
            // k level per dono objects different classes k hain!
        }
    }
}
