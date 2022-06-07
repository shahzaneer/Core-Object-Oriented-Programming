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
import java.util.Arrays;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class OperationsStorage extends JFrame {
    //* for update and delete operation we need to safe the objects in an arraylist first and then manipulate them  (Update or delete) and then write them into the
    //* the file again therefore the following array list is created to store the objects
    // * And to reduce the complexity of code we have added the object to list as soon as they are written in the file so that we can manipuate them afterwards

    private ArrayList<Student> a = new ArrayList<>();
    private File f = new File("Students.ser");

    //! Create for GUI
    public void writeToFile(Student s) {
        // file object
        // File f = new File("Students.ser");
        // Object for writing class (ObjectOutputStream)
        // Why this object is NULL? 
        // Answer : Because when even the constructor is called, the object (File)
        // is created but we want to keep it in the try block
        ObjectOutputStream oos = null;
        // write to file
        try {
            if (!f.exists()) {
                f = new File("Students.ser");
            }
            if (f.exists()) {

                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                oos.writeObject(s); // write object to file
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(f, true));
                oos.writeObject(s); // it will write the object to the file.
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

    //! Read for GUI
    public String readAll() {

        ObjectInputStream oo = null;
        StringBuilder details = new StringBuilder();

        if (!f.exists())
        return "File Not Found No Record!";

    if (f.exists()) {
        try {
            oo = new ObjectInputStream(new FileInputStream("Students.ser"));

            while (true) {

                // Reading object is below
                Student s = (Student) oo.readObject();
                details.append(s.toString());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        catch (EOFException e) {

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
            } catch (IOException e) {
            }

        }

        return details.toString();

    }

    return "File Not Found No Record!";

    }

    //! Search for GUI
    public String searchStudentByName(String Name) {
        StringBuilder details = new StringBuilder();
        boolean foundSome = false;
        ObjectInputStream oo = null;
        try {
            oo = new ObjectInputStream(new FileInputStream("Students.ser"));

            while (true) {

                // Reading object is below
                Student s = (Student) oo.readObject();
                if (s.getName().equalsIgnoreCase(Name)) {
                    details.append(s.toString());
                    foundSome = true;
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        catch (EOFException e) {

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

            } catch (IOException e) {
            }

        }

        if (!foundSome) {
            return "No Student Found !";
        }

        return details.toString();

    }

    public String searchStudentsByDepartment(String department) {
        StringBuilder details = new StringBuilder();
        ObjectInputStream oo = null;
        boolean foundSome = false;
        try {
            oo = new ObjectInputStream(new FileInputStream("Students.ser"));

            while (true) {

                // Reading object is below
                Student s = (Student) oo.readObject();
                if (s.getDepartment().getName().equalsIgnoreCase(department)) {
                    details.append(s.toString());
                    foundSome = true;
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        catch (EOFException e) {

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

            } catch (IOException e) {
            }

        }

        if (!foundSome) {
            return "No Such Department Found !";
        }

        return details.toString();
    }

    //! UPDATE for GUI
    boolean updateGPA(String s, double newCGPA) {

        boolean found = false;

        // a.clear(); //clearing the list before adding objects

        ObjectInputStream oo = null;
        try {

            oo = new ObjectInputStream(new FileInputStream("Students.ser"));

            try {
                while (true) {

                    Student k = (Student) oo.readObject();
                    a.add(k);
                }
            } catch (EOFException e) {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        finally {
            try {
                oo.close();
            } catch (IOException e) {

            }
        }

        // firstly manipulating the desired object for updating the CGPA

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getName().equalsIgnoreCase(s)) {
                found = true;
                a.get(i).setGPA(newCGPA);
            }
        }

        //* now again writing the Arraylist Objects to the file. first time it will create the file again and only then it will append!
        // file object
        // f = new File("Students.ser");
        ObjectOutputStream oos = null;
        int counter = 0;

        try {
            for (int i = 0; i < a.size(); i++) {
                // System.out.println("After Manipulation reading loop - size of arraylist"+ i);
                if (counter > 0) {
                    // System.out.println("counter greater then 0");
                    oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                    oos.writeObject(a.get(i));

                } 
                else {
                    // System.out.println("counter is 0");
                    oos = new ObjectOutputStream(new FileOutputStream(f));
                    oos.writeObject(a.get(i));
                    counter++;
                }
            }

            // For closing File

            if (oos != null) {
                oos.close();
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }


        return found;

    }

    //! DELETE for GUI
    boolean removeStudent(String toBeDeletedStudent) {

        boolean found = false;
        ObjectInputStream oo = null;

        try {
            oo = new ObjectInputStream(new FileInputStream("Students.ser"));

            try {
                while (true) {

                    Student s = (Student) oo.readObject();
                    a.add(s);

                }
            } catch (EOFException e) {
                // Move to the next line broda
            }
            // now we will move sequentially..

            oo.close();

            // removing the specified object from the arraylist
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).getName().equalsIgnoreCase(toBeDeletedStudent)) {
                    found = true;
                    a.remove(i);
                }
            }


            // now again writing the Arraylist objects in the file first time we will create a new file and then we will append
            // Object for writing class (ObjectOutputStream)
            ObjectOutputStream oos = null;
            // write to file
            int counter = 0;

            if (a.size() > 0) {
                for (int i = 0; i < a.size(); i++) {

                    System.out.println("Writing again to the file");

                    if (counter > 0) {
                        // when you are running it for the second and afterwards iterations you will append the file
                        oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                        oos.writeObject(a.get(i));

                    } else {
                        // for the first time you will create a new file
                        oos = new ObjectOutputStream(new FileOutputStream(f));
                        oos.writeObject(a.get(i));
                        counter++;
                    }

                }

                // For closing File

                if (oos != null) {
                    oos.close();
                }

            }
            else if (a.size() == 0) {
                System.out.println("File deleting");
                f.delete();
                System.out.println("File deleted");
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }


        return found;

    }

}
