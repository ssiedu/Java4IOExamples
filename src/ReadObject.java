
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
public static void main(String args[]) throws Exception {
    
    //reading object from empobj.txt
    FileInputStream fis=new FileInputStream("e:/iotest/empobj.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Emp e=(Emp) ois.readObject();
    e.info();
    ois.close();
    fis.close();
    
}
}
