
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String args[])
	{   
		int n;
		Scanner scanner = new Scanner(System.in);
		BigInteger fib[] = new BigInteger[5005];
		fib[0] = BigInteger.valueOf(0);
		fib[1] = BigInteger.valueOf(1);
		for(int i = 2;i<5002;i++)
		{
			fib[i]= fib[i-1].add(fib[i-2]);
		}
		
		while(scanner.hasNext())
		{
			n =scanner.nextInt();
			System.out.println("The Fibonacci number for "+n+" is "+fib[n]);
		}
		
	}
	
}
