
import java.io.Serializable;

public class Emp implements Serializable {
    private int eno;
    private String ename;
    private transient int sal;
    private String desg;
    private boolean permanent;

    public Emp(int eno, String ename, int sal, String desg, boolean permanent) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
        this.desg = desg;
        this.permanent = permanent;
    }
    
    public void info(){
        System.out.println("__________________________________");
        System.out.println("ECode      : "+eno);
        System.out.println("EName      : "+ename);
        System.out.println("Salary     : "+sal);
        System.out.println("Desg       : "+desg);
        System.out.println("Permanent  : "+permanent);
        System.out.println("__________________________________");
    }
}
