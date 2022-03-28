public class Runner {
    public static void main(String[] args) {
        My_Date d1 = new My_Date(25, 11, 2002);
        My_Date d2 = new My_Date(1, 1, 2022);
        Job j1 = new Job("Associate Software Engineer", 100000, 1);


        Employee e1 = new Employee("Shahzaneer", "Ahmed",d1 , d2, j1);

        e1.display();
        System.out.println(e1.checkSalary());  //should return true!
    }
}
