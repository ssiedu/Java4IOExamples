
import java.io.FileInputStream;

public class ReadData {

    public static void main(String args[]) throws Exception {
        //step-1 (open the stream)
        FileInputStream fis=new FileInputStream("e:/java4/Demo.java");
        //step-2 (read the data from stream)
        while(true){
        int n=fis.read();
        if(n==-1)break;
        System.out.print((char)n);
        }
        //step-3 (close the file)
        fis.close();
        
    }
}
/*
    To read the data from a file
1) open a stream between java program and file.
2) read the data from stream
*/
