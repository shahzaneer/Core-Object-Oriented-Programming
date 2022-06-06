import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
//! Object writing class 

public class MyObjectOutputStream extends ObjectOutputStream{

    // Our custom Object Output Stream class -> which is used to input object data
    // without writing the Stream headers.

    public MyObjectOutputStream() throws IOException{
        super();
    }
    public MyObjectOutputStream(OutputStream o) throws IOException{
        super(o);
    }
    
    public void writeStreamHeader(){}

    
}
