
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Filing 
{

   public static void main (String[] args) throws FileNotFoundException, IOException
{
    
    
        File f = new File("test.dat"); //file object contains the path of the file
        
        ObjectOutputStream oos; // object that helps in writing the object
        if(f.exists())
            oos = new MyObjectOutputStream(new FileOutputStream(f,true));
        else{
            oos = new ObjectOutputStream(new FileOutputStream(f));
        }
        oos.writeObject(new Employee("Buk",20));
        oos.close();

        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.dat"));
            Employee e = (Employee)ois.readObject();
            System.out.println(e.name);
            ois.close();
        }
        catch(ClassNotFoundException e)
        {
            System.err.println("Class not found");
        }
    
        
        
    }        
}
