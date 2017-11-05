package exception3;
import java.util.*;


public class Exc2 {
                 public static void main (String args[])
                 {
                	 int a,b,c;
                	 Random r = new Random();
                	 
                	 for(int i = 1;i<=3200;i++)
                	 {
                		try
                		{
                			b = r.nextInt();
                			c = r.nextInt();
                			a = 12345/(b/c);
                		}
                		
                		catch (ArithmeticException e)
                		{
                			System.out.println("division by zero");
                			a =0;
                		}
                		System.out.println("a =  :" + a);
                	 }
                	
                 }
}
