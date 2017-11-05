import java.util.*;
import java.math.*;

public class Main {
             public static void main (String args[])
             {
            	 Scanner sc =new Scanner(System.in);
            	 while (sc.hasNext()) {
                     String input = sc.next();

                     BigInteger n = new BigInteger(input);
                     BigInteger n_squared = n.pow(2);

                     String square = n_squared.toString();

                     if (square.endsWith(input) && n.compareTo(BigInteger.ZERO) != 0 && n.compareTo(BigInteger.ONE) != 0) {
                         System.out.println("Automorphic number of " + input.length() + "-digit.");
                     } else {
                         System.out.println("Not an Automorphic number.");
                     }
            		 
            	 }
             }
 }
