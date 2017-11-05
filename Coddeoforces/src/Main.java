import java.util.*;
import java.math.*;

public class Main {
			public static void main(String args[])
			{
				Scanner sc = new Scanner (System.in);
				
				int test = sc.nextInt();
				BigInteger x = BigInteger.ONE;
				while(test>0)
				{  BigInteger n = new BigInteger(sc.next());
				
				  x =  x.multiply(n);
					
		   test--;
				}
				System.out.println(x);
			}
}
