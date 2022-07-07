public class Runner {
    public static void main(String[] args) {
        Package pkg[] = new Package[2];
        // father class ki array;

        Ounce o1 = new Ounce(2.5);
        Ounce o2 = new Ounce(5.0);

        pkg[0] = new OverNightPackage("Shahzaneer Ahmed", "Pakistan", "Hafsa", "Canada", o1, 500, 1000);
        pkg[1] = new TwoDayPackage("Shahzaneer Ahmed", "New Zealand", "Saad Hamid", "Singapore", o2, 700, 2000);

        for (int i = 0; i < pkg.length; i++) {
            System.out.println(pkg[i].toString());
            System.out.println(pkg[i].calculateCost());
        }
    }
}
