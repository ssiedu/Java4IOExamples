
import java.io.FileInputStream;

public class ReadDataThree {
public static void main(String args[]) throws Exception{
        FileInputStream fis=new FileInputStream("e:/java4/data.txt");
        System.out.println(fis.markSupported());
        System.out.println((char)fis.read());//A
        System.out.println((char)fis.read());//B
        System.out.println((char)fis.read());//C
        System.out.println((char)fis.read());//D->E
        fis.skip(3);//E,F,G->H
        System.out.println((char)fis.read());//H
        System.out.println((char)fis.read());//I
        System.out.println((char)fis.read());//J->K
        fis.skip(5);//K,L,M,N,O->P
        System.out.println((char)fis.read());//P
        System.out.println((char)fis.read());//Q
        System.out.println((char)fis.read());//R
        fis.close();
    }      
}
