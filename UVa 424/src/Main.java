import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[])
	{
			Scanner sc =  new Scanner(System.in);
			
			BigInteger sum = BigInteger.ZERO;
			while(true)
			{
			BigInteger n = new BigInteger(sc.next());
			sum = sum.add(n);
			
			//System.out.println(sum);
            
			if(n.equals(BigInteger.ZERO))
            {
            	System.out.println(sum);
            	break;
            }
            
            }
			
			}
	
}
