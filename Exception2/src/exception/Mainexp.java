package exception;
import java.util.*;

public class Mainexp {
               static Scanner s = new Scanner(System.in);
               public static void main (String args[]){      
                 
        	  MethodExp m = new MethodExp();
        	   
        	   int a = s.nextInt();
              int b = s.nextInt();
              
              try{
            	  m.compute(a);
            	  m.compute(b);
              }
            		  
              catch (MyException1 e)
              {
            	  System.out.println("caught exception");
              }
}
}