import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileOperations {
    private ArrayList<Employee> a = new ArrayList<>();
    private File f = new File("employee.ser");

    //! Create for GUI
    public void writeToFile(Employee emp) {
        // file object
        // File f = new File("employee.ser");
        // Object for writing class (ObjectOutputStream)
        // Why this object is NULL? 
        // Answer : Because when even the constructor is called, the object (File)
        // is created but we want to keep it in the try block
        ObjectOutputStream oos = null;
        // write to file
        try {
            if (!f.exists()) {
                f = new File("employee.ser");
            }
            if (f.exists()) {

                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                oos.writeObject(emp); // write object to file
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(f, true));
                oos.writeObject(emp); // it will write the object to the file.
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
            oo = new ObjectInputStream(new FileInputStream("employee.ser"));

            while (true) {

                // Reading object is below
                Employee emp = (Employee) oo.readObject();
                details.append(emp.toString());
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
    public String searchEmployeeWithSalaryGreaterorEqualToFiftyThousand(String Name) {
        StringBuilder details = new StringBuilder();
        boolean foundSome = false;
        ObjectInputStream oo = null;
        try {
            oo = new ObjectInputStream(new FileInputStream("employee.ser"));

            while (true) {

                // Reading object is below
                Employee emp = (Employee) oo.readObject();
                if ((emp.getName().equalsIgnoreCase(Name)) && (emp.getJ().getSalary() >= 50000)){
                    details.append(emp.toString());
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

    //! UPDATE for GUI
    boolean updateJob(String name, String newDesignation , double newSalary) {

        boolean found = false;

        ObjectInputStream oo = null;
        try {

            oo = new ObjectInputStream(new FileInputStream("employee.ser"));

            try {
                while (true) {

                    Employee emp = (Employee) oo.readObject();
                    a.add(emp);
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

        // firstly manipulating the desired object for updating the Job

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getName().equalsIgnoreCase(name)) {
                found = true;
                a.get(i).getJ().setDesignation(newDesignation);
                a.get(i).getJ().setSalary(newSalary);
            }
        }

        //* now again writing the Arraylist Objects to the file. first time it will create the file again and only then it will append!
    
        ObjectOutputStream oos = null;
        int counter = 0;

        try {
            for (int i = 0; i < a.size(); i++) {
                if (counter > 0) {
                    oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                    oos.writeObject(a.get(i));

                } 
                else {
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

}
