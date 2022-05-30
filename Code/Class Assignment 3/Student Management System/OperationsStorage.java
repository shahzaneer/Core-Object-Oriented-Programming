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

    // We are using Sequential File handling so here we cannot have as such Direct update or Delete Methods for the objects
    //  here we will use the intuition of Arraylist first for reading the objects and storing them then manipulating in the case of updation and removing the object in the case of Deletion

    void updateCGPA(Student currentStudent, double newCGPA) {
        // firstly reading and storing them in the Arraylist
            ObjectInputStream oo = null;
            ArrayList<Student> a = new ArrayList<>();

            try {
                oo = new ObjectInputStream(new FileInputStream("Students.ser"));
                while (true) {

                    // Reading object is below
                    Student s = (Student) oo.readObject();
                    // System.out.println(s.toString());
                    a.add(s);
                }

            } 
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            catch (EOFException e) {
                // return;

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
                    e.printStackTrace();
                }

            }



        // Now manimupating the desired object for updating the CGPA
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getName().equalsIgnoreCase(currentStudent.getName())) {
                a.get(i).setGPA(newCGPA);
            }
        }

        // now again writing the Arraylist Objects to the file we will write the parameter for appending to false so that we can rewrite the objects again but this time the manipulated one!
        // file object
        File f = new File("Students.ser");
        // Object for writing class (ObjectOutputStream)
        ObjectOutputStream oos = null;
        // write to file
        int counter = 0;

        for (int i = 0; i < a.size(); i++) {
            try {
                if (counter > 0) {
                    oos = new MyObjectOutputStream(new FileOutputStream(f));
                    oos.writeObject(a.get(i));
                } 
                else {
                    oos = new ObjectOutputStream(new FileOutputStream(f));
                    oos.writeObject(a.get(i)); // it will write the object to the file.
                    counter++;

                }

            } 
            catch (IOException e) {
                e.printStackTrace();
        }

            catch (Exception e) {
                System.err.println("Cannot Write Object");
            }

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

    void deleteStudent(Student toBeDeletedStudent) {
        // firstly reading and storing the Student objects in the array list 
         ObjectInputStream oo = null;
            ArrayList<Student> a = new ArrayList<>();

            try {
                oo = new ObjectInputStream(new FileInputStream("Students.ser"));
                while (true) {

                    // Reading object is below
                    Student s = (Student) oo.readObject();
                    a.add(s);
                }

            } 
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            catch (EOFException e) {
                // return;

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
                    e.printStackTrace();
                }

            }
            

            // Now removing the specified object from the arraylist
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i).getName().equalsIgnoreCase(toBeDeletedStudent.getName())) {
                    a.remove(i);
                }
            }
            
            // now again writing the remaining objects in the file without appending (newly)
            File f = new File("Students.ser");
        // Object for writing class (ObjectOutputStream)
        ObjectOutputStream oos = null;
        // write to file
        int counter = 0;

        for (int i = 0; i < a.size(); i++) {
            try {
                if (counter > 0) {
                    oos = new MyObjectOutputStream(new FileOutputStream(f));
                    oos.writeObject(a.get(i));
                } 
                else {
                    oos = new ObjectOutputStream(new FileOutputStream(f));
                    oos.writeObject(a.get(i)); // it will write the object to the file.
                    counter++;

                }

            } 
            catch (IOException e) {
                e.printStackTrace();
        }

            catch (Exception e) {
                System.err.println("Cannot Write Object");
            }

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
}
    
        
