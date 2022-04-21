public class Runner {
    public static void main(String[] args) {
        Convert conversions[] = new Convert[3];
        conversions[0] = new FahrenheitToCelsius(23);
        conversions[1] = new FeetsToMeters(12);
        conversions[2] = new LitersTOGallons(10);

        for (int i = 0; i < conversions.length; i++) {
            conversions[i].compute();
            System.out.println(conversions[i].toString());
        }
    }
}


// Runtime polymorphism --> only when early binding and late binding both are present!
