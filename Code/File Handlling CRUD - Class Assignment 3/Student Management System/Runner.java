public class Runner {
    public static void main(String[] args) {
        OperationsStorage o = new OperationsStorage();
        Department cs = new Department("Computer Science", "CUI Islamabad");
        Department cyber = new Department("Cyber Security", "CUI Islamabad");

        Student s = new Student("Shahzaneer Ahmed", "0316-4606490", "Male", 3.23, 3, 'B', cs);
        Student s2 = new Student("Laiba Imran", "0316-XXXXXXX", "Female", 3.23, 3, 'A', cyber);
        Student s3 = new Student("Rabbiya Tabassum", "0316-XXXXXXX", "Female", 3.48, 3, 'A', cyber);
        Student s4 = new Student("Raheem Arif", "0316-57532236", "Male", 3.56, 3, 'A', cyber);

        

        // o.writeToFile(s);
        // o.writeToFile(s2);
        // o.writeToFile(s3);
        // o.writeToFile(s4);



        // o.readAll();

        // try {
        //     o.updateCGPA(s2, 4);
        // }
        
        // catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        // catch (Exception e) {
        //     e.printStackTrace();
        // }

        // o.readAll();

        // o.updateGPA(s2, 12);
        // o.readAll();

        // o.removeStudent(s2);
        // o.readAll();


        // try {
        //     o.deleteStudent(s);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // try {
        //     o.deleteStudent(s);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // o.readAll();

        // o.searchStudentByName("Laiba Imran");
        // o.searchStudentByName("Shahzaneer Ahmed");


        // o.searchStudentsByDepartment("Bio Sciences");
        // o.searchStudentByName("Hafsa Khalid");
    }
}
