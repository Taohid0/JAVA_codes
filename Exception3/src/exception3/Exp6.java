package exception3;

public class Exp6 {
          
	static void demoProc()
	{
		try{
			throw new NullPointerException ("demo");
		}
		catch (NullPointerException e)
		{
			System.out.println("null pointer exception");
			throw e;
		}
	}
}
