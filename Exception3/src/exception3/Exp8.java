package exception3;

public class Exp8 {
              
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("inside throwOne");
		throw new IllegalAccessException("demo");
	}
}
