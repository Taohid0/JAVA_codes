import java.util.*;
import java.math.*;

public class Main {
     public static void main(String args[])
     {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 int test =sc.nextInt();
    	 
    	 while(--test>=0)
    	 {
    		 BigInteger n1 = new BigInteger(sc.next());
    		 String c = sc.next();
    		 BigInteger n2 = new BigInteger(sc.next());
    		 
    		 BigInteger gcd = n1.gcd(n2);
    		 
    		 System.out.println(n1.divide(gcd)+" / "+n2.divide(gcd));
    	 }
     }
}
