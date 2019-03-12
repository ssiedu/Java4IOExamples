//this code is trying to save emp obj to a file empobj.txt

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
public static void main(String args[]) throws Exception {
    
    Emp emp=new Emp(111, "AAA", 50000, "Manager", true);
    
    FileOutputStream fos=new FileOutputStream("e:/iotest/empobj.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(emp);
    oos.close();
    fos.close();
    System.out.println("Object Stored");
    
}    
}
