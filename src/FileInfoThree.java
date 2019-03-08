
import java.io.File;
import java.util.Date;

public class FileInfoThree {
    public static void main(String args[]){
        File f=new File("e:/java4/ExTwo.java");
        long val=f.lastModified();
        System.out.println(val);
        Date dt=new Date(val);
        System.out.println(dt);
    }
}
