
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DOSExample {
    public static void main(String args[]) throws Exception {

        int eno=1501;
        double sal=45000.55;
        boolean married=true;
        
        //to write something to file FileOutputStrem
        
        FileOutputStream fos=new FileOutputStream("e:/iotest/einfo.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        dos.writeInt(eno);
        dos.writeDouble(sal);
        dos.writeBoolean(married);
        
        dos.close();
        fos.close();
        
        System.out.println("Data Stored");
        
    }
}
/*
    DataOutputStream


    void writeByte(byte)
    void writeShort(short)
    void writeInt(int)
    void writeLong(long)
    void writeFloat(float)
    void writeDouble(double)
    void writeBoolean(boolean)













*/