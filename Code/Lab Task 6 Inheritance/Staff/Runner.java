public class Runner {
    public static void main(String[] args) {
        // Person p = new Person("Shahzaneer Ahmed", "24 Bahawal sher road Mozang janazgah Lahore", 0316-4606490, "shahzaneer.dev@gmail.com");
        Student shah = new Student("Shahzaneer Ahmed", "24 Bahawal Sher Road Lahore", "0316-4606490", "shahzaneer.dev@gmail.com", "Cs Sophomore");
        My_Date d1 = new My_Date(25, 11, 1999);
        Faculty tra = new Faculty("Tehseen Riaz Abbasi ", "CUI Islamabad", "0321-5679321", "trasays.gmail.com", "CS 1st floor Room 34", 400000, d1, 7,"Professor");
        tra.display();
 
        shah.display();
    }
}
