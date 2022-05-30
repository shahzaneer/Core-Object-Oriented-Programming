import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class OperationsStorage {

    public void writeToFile(Student s) {
        // file object
        File f = new File("Students.ser");
        // Object for writing class (ObjectOutputStream)
        ObjectOutputStream oos = null;
        // write to file
        try {
            if (f.exists()) {

                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                oos.writeObject(s);
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
                System.err.println("File Closed");

            } catch (IOException e) {
            }

        }

    }

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
}
    
        
