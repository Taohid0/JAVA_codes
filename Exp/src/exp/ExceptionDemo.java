package exp;

public class ExceptionDemo {
             
	static void compute (int a) throws MyException
	{
		System.out.println("compute");
		
		if(a>10){
			throw new MyException (a);
		}
		System.out.println("normal exit");
     
	}
} 
