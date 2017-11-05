import java.util.*;
import java.math.*;

public class Main {
   
	public static void main(String args[])
	{
		BigInteger r;
		String b1;
		int test;
		Scanner sc =new Scanner(System.in);
		test = sc.nextInt();
		for(int i = 1;i<=test;i++)
		{
			b1= sc.next();
			r = new BigInteger(b1,2);
			System.out.println("Case "+i+": "+r);
		}
	}
}
