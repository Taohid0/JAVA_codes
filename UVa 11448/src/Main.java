import java.util.*;
import java.math.*;

public class Main {
                 public static void main(String args[])
                 {
                	 Scanner sc = new Scanner(System.in);
                	 int test =sc.nextInt();
                	 BigInteger first = BigInteger.ONE;
                	 BigInteger second = BigInteger.ONE;
                	 
                	 while(test-->0)
                	 {
                		 first =sc.nextBigInteger();
                		 second = sc.nextBigInteger();
                		 System.out.println(first.subtract(second));
                		 
                	 }
                	 
                 }
}
