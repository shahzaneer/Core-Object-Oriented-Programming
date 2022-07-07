public class Runner {
    public static void main(String[] args) {
        Person fadwi[] = new Person[2];

        
        fadwi[0] = new Student("Shahzaneer Ahmed",3.23);
        fadwi[1] = new Professor("Molana Room", 52);

        System.out.println("Before Downcasting");
        for (int i = 0; i < fadwi.length; i++) {
            System.out.println(fadwi[i].toString());
            System.out.println(fadwi[i].isOutstanding());

            // downcasting
            if (fadwi[i] instanceof Professor) {
                Professor p1 = (Professor) fadwi[i];
                p1.setNumberOfPublications(100);
                fadwi[i] = p1;
            }
        }

        System.out.println("After downcasting");

        for (int i = 0; i < fadwi.length; i++) {
            System.out.println(fadwi[i].toString());
            System.out.println(fadwi[i].isOutstanding());
        }


        
        
    }
}
