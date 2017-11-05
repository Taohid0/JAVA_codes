package exception_own;

public class ExceptionMethod {
                    
	public static  void multiple (int a) throws Exp
	{
		    System.out.println("this is inside multiple method");
		    
		    if (a>10)
		    {
		    	throw new Exp();
		    }
		    System.out.print("normal exit");
	}
}
