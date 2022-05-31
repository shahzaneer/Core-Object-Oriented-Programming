import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;


public class OperationsStorage {
    //* for update and delete operation we need to safe the objects in an arraylist first and then manipulate them  (Update or delete) and then write them into the
    //* the file again therefore the following array list is created to store the objects
    // * And to reduce the complexity of code we have added the object to list as soon as they are written in the file so that we can manipuate them afterwards

    private ArrayList<Student> a = new ArrayList<>();
    
    //! Create
    public void writeToFile(Student s) {
        // file object
        File f = new File("Students.ser");
        // Object for writing class (ObjectOutputStream)
        // Why this object is NULL? 
        // Answer : Because when even the constructor is called, the object (File)
        // is created but we want to keep it in the try block
        ObjectOutputStream oos = null; 
        // write to file
        try {
            if (f.exists()) {

                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                oos.writeObject(s); // write object to file
                a.add(s); // add object to array list
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(f, true));
                oos.writeObject(s); // it will write the object to the file.
                a.add(s); // add object to array list
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        catch (Exception e) {
            System.err.println("Cannot Write Object");
        }

        // For closing File

        if (oos != null) {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //! Read 
    public void readAll() {

        ObjectInputStream oo = null;
        try {
            oo = new ObjectInputStream(new FileInputStream("Students.ser"));

            while (true) {

                // Reading object is below
                Student s = (Student) oo.readObject();
                System.out.println(s.toString());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        catch (EOFException e) {
            return;

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                oo.close();

            } 
            catch (IOException e) {
            }

        }

    }

    //! Search
    void searchStudentByName(String Name) {
        ObjectInputStream oo = null;
        try {
            oo = new ObjectInputStream(new FileInputStream("Students.ser"));

            while (true) {

                // Reading object is below
                Student s = (Student) oo.readObject();
                if (s.getName().equalsIgnoreCase(Name)) {
                    System.out.println(s.toString());
                    break;
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        catch (EOFException e) {
            return;

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                oo.close();
                System.err.println("File Closed");

            } catch (IOException e) {
            }

        }

    }
    
    void searchStudentsByDepartment(String department) {
        ObjectInputStream oo = null;
        try {
            oo = new ObjectInputStream(new FileInputStream("Students.ser"));

            while (true) {

                // Reading object is below
                Student s = (Student) oo.readObject();
                if (s.getDepartment().getName().equalsIgnoreCase(department)) {
                    System.out.println(s.toString());
                    break;
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        catch (EOFException e) {
            return;

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                oo.close();
                System.err.println("File Closed");

            } catch (IOException e) {
            }

        }
    }

    // We are using Sequential File handling so here we cannot have as such Direct update or Delete Methods for the objects
    //  here we will use the intuition of Arraylist first for reading the objects and storing them then manipulating in the case of updation and removing the object in the case of Deletion

    //! UPDATE 
    void updateCGPA(Student currentStudent, double newCGPA) throws Exception {

        // firstly manimupating the desired object for updating the CGPA
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getName().equalsIgnoreCase(currentStudent.getName())) {
                a.get(i).setGPA(newCGPA);
            }
        }

        //* now again writing the Arraylist Objects to the file. first time it will create the file again and only then it will append!
        // file object
        File f = new File("Students.ser");
        // Object for writing class (ObjectOutputStream)
        ObjectOutputStream oos = null;
        // write to file - code
        int counter = 0;

        for (int i = 0; i < a.size(); i++) {
            if (counter > 0) {
                // System.out.println("other Times here you will append");
                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                oos.writeObject(a.get(i));
            } else {
                // System.out.println("first Time here you will create new File");
                oos = new ObjectOutputStream(new FileOutputStream(f));
                oos.writeObject(a.get(i)); // it will write the object to the file.
                counter++;

            }

        }

        // For closing File

        if (oos != null) {
            oos.close();
        }

    }
    
    // !DELETE

    void deleteStudent(Student toBeDeletedStudent) throws Exception {

            // removing the specified object from the arraylist
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).getName().equalsIgnoreCase(toBeDeletedStudent.getName())) {
                    a.remove(i);
                }
            }
            
            // now again writing the Arraylist objects in the file first time we will create a new file and then we will append
            File f = new File("Students.ser");
        // Object for writing class (ObjectOutputStream)
        ObjectOutputStream oos = null;
        // write to file
        int counter = 0;

        for (int i = 0; i < a.size(); i++) {
            
                if (counter > 0) {
                    // when you are running it for the second and afterwards iterations you will append the file
                    oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                    oos.writeObject(a.get(i));
                } 
                else {
                    // for the first time you will create a new file
                    oos = new ObjectOutputStream(new FileOutputStream(f));
                    oos.writeObject(a.get(i)); // it will write the object to the file.
                    counter++;

                } 

        }
        
        // For closing File

        if (oos != null) {
            oos.close();
        }

    }


}
    
        
