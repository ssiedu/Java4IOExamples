import java.util.Scanner;

public class ScannerDemo {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Rno");
        int rno=sc.nextInt();
        System.out.println("Enter Your Name");
        String name=sc.next();
        System.out.println("Your Inputs : ");
        System.out.println(rno);
        System.out.println(name);
        
    }
}
