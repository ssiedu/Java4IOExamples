
import java.io.File;

public class FileInfo {
    public static void main(String args[]){
        //create an object of File class.
        File f=new File("e:/java4/data.txt");
        
        if(f.exists()==true){
            long val=f.length();
            System.out.println("Size : "+val);
            
            boolean b1=f.canWrite();
            if(b1==true){
                System.out.println("You Can Write");
            }else{
                System.out.println("Its Read Only");
            }
            
            boolean b2=f.isHidden();
            
            if(b2==true){
                System.out.println("Yes, Its Hidden");
            }else{
                System.out.println("Its Not Hidden");
            }
            
            
            
            
        }else{
            System.out.println("Does not exists");
        }
            
    }
}

/*
    long length()
    boolean exists()
    boolean canWrite()
    boolean isHidden()
    boolean isFile()
    boolean isDirectory()
    String[] list()
    








*/
