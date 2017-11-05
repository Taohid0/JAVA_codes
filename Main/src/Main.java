
import java.util.Scanner;
import java.math.BigInteger;


public class Main {
              
	public static void main(String []args)
	{
		int n,a;
		
		Scanner cin = new Scanner(System.in);
	   
		while(cin.hasNextInt())
		{
			n = cin.nextInt();
			a = cin.nextInt();
			
			BigInteger sum  = new BigInteger("0"),tmpA = BigInteger.valueOf(a);
			
			for(int i = 1;i<=n;i++)
			{
				sum= sum.add(BigInteger.valueOf(i).multiply(tmpA.pow(i)));
			}
			System.out.println(sum);
		}
	}
}
