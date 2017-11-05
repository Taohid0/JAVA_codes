public class Exp1 {
                  
	            public static void main (String args[])
	            {
	            	try
	            	{
	            		int a = 10;
	            		int d  = 0;
	            		a  = a/d;
	            	}
	            	catch(ArithmeticException e)
	            	{
	            		System.out.println("division by sero " + e);
	            	}
	            	System.out.println("after try catch statement");
	            }
}
