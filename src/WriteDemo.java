
import java.io.FileOutputStream;

public class WriteDemo {
public static void main(String args[]) throws Exception {
    
    //FileOutputStream fos=new FileOutputStream("e:/iotest/myfile.txt", true);
    FileOutputStream fos=new FileOutputStream("e:/iotest/myfile.txt");
    
    String s="some data stored using java io apis";
    
    byte b[]=s.getBytes();
    //fos.write(b); //write the entire byte array
    
    //fos.write(b,5,15);
    fos.write(b,0,20);
    
    
    
    /*
    fos.write(65);
    fos.write(66);
    fos.write(67);
    fos.write(68);
    
    
    fos.write(97); fos.write(98); fos.write(99);
    fos.write(100); fos.write(101);
    */
    
    fos.close();
    System.out.println("Data Stored");
    
}    
}
/*
    void write(int)
    void write(byte[])
    void write(byte[],int,int)

*/
