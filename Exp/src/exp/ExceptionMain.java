package exp;
import java.util.*;

public class ExceptionMain {
                 static Scanner s = new Scanner(System.in);
 
                 public static void main (String args[])
                 {
                	 try
                	 {int a = s.nextInt();
                	  int b = s.nextInt();
                	  
                		 ExceptionDemo.compute(a);
                		 ExceptionDemo.compute(b);
                	 }
                	 catch (MyException e)
                	 {
                		 System.out.println("insde MyException " + e);
                	 }
                	 
                 }
                  
}
