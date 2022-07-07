public class Runner {
    public static void main(String[] args) {
        Person persons[] = new Person[2];
        My_Date d1 = new My_Date(12,2,2022);
        persons[0] = new Employee("Laiba Imran", d1, false, "Cyber Analyst", 2500, 6);

        // Employes array
        Employee e1 = new Employee("Laiba Imran", d1, false, "Cyber Analyst", 2500, 6);
        Employee e2 = new Employee("Rabbiya Tabassum", d1, false, "Networking intern", 2500, 6);
        Employee e3 = new Employee("Abdur Rehman", d1, false, "Penetrating tester", 2500, 6);

        Employee eArr [] = {e1,e2,e3};

        persons[1] = new Manager("Raheem Arif", d1, true, eArr, 3, 50000);
        

        // now calling them polymorphically
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        
        }
    }
}
