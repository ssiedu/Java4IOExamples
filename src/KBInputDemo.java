
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class KBInputDemo {
public static void main(String args[]) throws Exception {
    
    //converting a byte stream to character stream
    //InputStreamReader reader=new InputStreamReader(System.in);
    //BufferedReader br=new BufferedReader(reader);
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter Name");
    String name=br.readLine();
    System.out.println("Enter Age");
    int age=Integer.parseInt(br.readLine());
    System.out.println("Your Mobile");
    long mobile=Long.parseLong(br.readLine());
    System.out.println("Your Weight");
    double weight=Double.parseDouble(br.readLine());
    
    System.out.println("Your Inputs : ");
    System.out.println("__________________________________");
    System.out.println("Your Name   : "+name);
    System.out.println("Your Age    : "+age);
    System.out.println("Your Mobile : "+mobile);
    System.out.println("Your Weight : "+weight);
    System.out.println("__________________________________");
            
    
    
    
    
    
    
}    
}
