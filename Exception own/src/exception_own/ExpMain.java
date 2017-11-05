package exception_own;
import java.util.*;

public class ExpMain {
	
             static Scanner s = new Scanner(System.in);
              
             public static void main (String args[])
             {
            	 try{
            		 ExceptionMethod.multiple(s.nextInt());
            	 }
            	 catch (Exp e)
            	 {
            		 System.out.println("an exception has be caught " +e);
            	 }
             }
}
