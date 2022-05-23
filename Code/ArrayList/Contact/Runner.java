import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class Runner {
    public static void main(String[] args) {
        ArrayList <Contact> cs = new ArrayList<Contact>();
        while (true) {
            System.out.println("""
                    1. Add Contact
                    2. Display Contact
                    3. Search Specific Contact
                    4. Delete Specific Contact
                    5. Exit
                    """);

            int option;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Option");
            option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1 -> {
                    // add Contact
                    String firstName, lastName, emailAddress, phoneNumber;
                    System.out.println("Enter first Name");
                    firstName = sc.nextLine();
                    System.out.println("Enter Second Name");
                    lastName = sc.nextLine();
                    System.out.println("Enter Phone Number");
                    phoneNumber = sc.nextLine();
                    System.out.println("Enter Email Address");
                    emailAddress = sc.nextLine();
                    cs.add(new Contact(firstName, lastName, phoneNumber, emailAddress));


                }
                case 2 -> {
                    // Display
                    for (int i = 0; i < cs.size(); i++) {
                        System.out.println(cs.get(i).toString());
                    }
                    
                }
                case 3 -> {
                    // Search
                    String search;
                    System.out.println("Search : ");
                    search = sc.nextLine();
                    System.out.println("The Search Contacts are : ");
                    for (int i = 0; i < cs.size(); i++) {
                        if (cs.get(i).getFirstName().equalsIgnoreCase(search) && cs.get(i).getSecondName().equalsIgnoreCase(search) && cs.get(i).getEmailAddress().equalsIgnoreCase(search) && cs.get(i).getPhoneNumber().equalsIgnoreCase(search)){
                            System.out.println(cs.get(i).toString());
                        }

                    } 
                }

                case 4 -> {
                    // Delete Specific Contact
                    String phoneNumber;
                    System.out.println("Enter Phone Number");
                    phoneNumber = sc.nextLine();

                    for(int i=0;i<cs.size();i++){
                        if (cs.get(i).getPhoneNumber().contains(phoneNumber)) {
                            // System.out.print("Pakistan noor hai");
                            cs.remove(i);
                        }


                    }
                    
                }

                case 5 -> {
                    System.exit(0);
                }
            }        


        }
        
    }
}
