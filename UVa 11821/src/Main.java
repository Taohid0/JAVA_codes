import java.util.*;
import java.math.*;

public class Main {

	public static void main(String args[]){
	   Scanner input = new Scanner (System.in);
    
    int testCase = input.nextInt();
    BigDecimal res;
    BigDecimal num1;
     
    while ( testCase-- != 0 ) {
        res = BigDecimal.ZERO;
        num1 = BigDecimal.ZERO;
        do {
            res = res.add(num1);
            num1 = input.nextBigDecimal();
        } while ( num1.compareTo(BigDecimal.ZERO) != 0 );
         
        char output [] = res.toString().toCharArray();
        int len = output.length - 1;
         
        while ( len >= 0 && output [len] == '0' ) len--;
        if ( len >= 0 && output [len] == '.' ) len--;
         
        for ( int i = 0; i <= len; i++ ) System.out.print (output [i]);
        System.out.println ();
    }
}
}