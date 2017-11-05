import java.util.*;

public class Exc2 {
               public static void main(String args[])
               {
            	   Random r  = new Random();
            	   
            	   int a,b,c;
            	   
            	   for(int i = 1;i<=32000;i++){
            	   
            	   try
            	   {   b = r.nextInt();
            	       c = r.nextInt();
            		   
            		   a =b/c;
            		   a = a/0;
            		   
            		   System.out.println(a);
            	   }
            	   catch(ArithmeticException e)
            	   {
            		   a = 100;
            		   System.out.println("arithmetic excepception a = "+a );
            	   }
            	   
               }}
}
