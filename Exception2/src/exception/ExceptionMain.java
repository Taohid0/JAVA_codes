package exception;
import java.util.*;

public class ExceptionMain {
   
                	static void compute (int n) throws MyException{
                		System.out.println("called compute " + n);
                		
                		if(n>10)
                		{
                			throw new MyException(n);
                		}
                		System.out.println("normal exit");
                	}
                	static Scanner s  = new Scanner(System.in);
                	
                	public static void main(String args[])
                	{ 
                		int a  = s.nextInt();
                		int c = s.nextInt();
                		
                		try
                		{
                			compute(a);
                			compute(c);
                		}
                		catch (MyException e)
                		{
                			System.out.println("caught " + e);
                		}
                	}
                
}
