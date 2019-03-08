
import java.io.File;

public class FileOperations {
public static void main(String args[]) throws Exception{
    
   // File f=new File("e:/java4/pqr");
   // boolean b=f.mkdir();
   
   //File f=new File("e:/java4/abc");
   //boolean b=f.delete();
   
   //File f1=new File("e:/java4/trial.txt");
   //File f2=new File("e:/iotest/data.txt");
   //boolean b=f1.renameTo(f2);
   
   File f=new File("e:/iotest/myfile.xlsx");
   boolean b=f.createNewFile();
   
    if(b==true){
        System.out.println("Operation Success");
    }else{
        System.out.println("Operation Failed");
    }
    
}    
}
