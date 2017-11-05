import java.util.*;
import java.math.*;
public class Main {

	
	public static void main (String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n;
		n = sc.nextInt();
		BigInteger b1,b2;
		while(n-->0)
		{
			b1 = sc.nextBigInteger();
			b2 = sc.nextBigInteger();
			System.out.println(b2.mod(b1));
		}
	}
}
