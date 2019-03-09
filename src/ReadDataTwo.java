import java.io.FileInputStream;

public class ReadDataTwo {
    public static void main(String args[]) throws Exception{
        FileInputStream fis=new FileInputStream("e:/java4/data.txt");
        //FileInputStream fis=new FileInputStream("e:/java4/Test.java");
        int available=fis.available();
        byte b[]=new byte[available];
        int n=fis.read(b);
        String s=new String(b);
        System.out.println(n);
        System.out.println(s);
        fis.close();
    }   
}
/*
    int read(byte[])
    int available()
*/