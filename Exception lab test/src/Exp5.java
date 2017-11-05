
public class Exp5 {
               
	static void demo() throws NullPointerException
	{
		System.out.println("inside demo");
		throw new NullPointerException();
	}
	
	public static void main(String args[])
	{
		try
		{
			demo();
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
}
