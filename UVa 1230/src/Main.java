import java.util.*;
import java.math.*;

public class Main {
			public static void main(String args[])
			{
				Scanner sc = new Scanner (System.in);
				
				int test = sc.nextInt();
				
				while(test-->0)
				{
					BigInteger x = new BigInteger(sc.next());
					BigInteger y = new BigInteger(sc.next());
					BigInteger n = new BigInteger(sc.next());
					
					System.out.println(x.modPow(y, n));
				}
			}
}
