import java.math.BigInteger;
import java.util.*;

public class main {
         public static void main(String args[])
         {
        	 Scanner sc = new Scanner(System.in);
        	  
        	 while(sc.hasNext()){
        	 BigInteger p = new BigInteger(sc.next());
      	      BigInteger m = new BigInteger(sc.next());
      	      
      	      System.out.println(p.multiply(m));
         }}
}
