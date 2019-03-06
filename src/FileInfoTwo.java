
import java.io.File;

public class FileInfoTwo {
    public static void main(String args[]){
        File f=new File("e:/java4");
        //File f=new File("c:/windows");
        String s[]=f.list();
        
        for(String tmp:s){
            System.out.println(tmp);
        }
        
    }
}
