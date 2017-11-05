package exception3;

public class Exp9Main {
            public static void main (String args[])
            {
            	try
            	{
            		Exp9.procA();
            	}
            	catch (RuntimeException e)
            	{
            		System.out.println("Exception caught at procC");
            	}
            	
            	Exp9.procB();
            	Exp9.procC();
            }
            
            
            
}
