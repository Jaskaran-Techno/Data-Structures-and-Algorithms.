import java.io.*;  
import java.nio.*;   
import java.util.*;   
public class BufferLimitExample1   
{   
    public static void main(String[] args)   
    {   
        // using the allocation() function to define   
        //  allocate DoubleBuffer   
        DoubleBuffer db = DoubleBuffer.allocate(6);   
        // Use the put() method to insert a double  
        // value into the double buffer  
        db.put(10.5);  
        db.put(20.5);  
        // printing the double buffer  
        System.out.println("The DoubleBuffer before " + "setting the buffer's limit: " + Arrays.toString( db.array()) + "\n at the Position: " + db.position() + "\n and the Limit: " + db.limit());   
        // Limiting the double-buffer with the limit() function   
        db.limit(2);   
        //Display the double buffer  
        System.out.println("The DoubleBuffer before " + "setting the buffer's limit: " + Arrays.toString( db.array()) + "\n at the Position: " + db.position() + "\n and the Limit: " + db.limit());   
    }   
}     
