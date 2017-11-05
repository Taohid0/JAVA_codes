package exception3;

public class Exc1 {
            public static void main (String args[])
            {
            	int a,d= 0;
            	
            	try
            	{
            		a = 42/d;
            		System.out.println("this will not be printed");
            	}
            	catch( ArithmeticException e)
            	{
            		System.out.println("division by zero ");
            	}
            	System.out.println("after try catch block");
            }
}
