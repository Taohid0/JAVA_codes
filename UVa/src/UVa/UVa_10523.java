package UVa;
import java.math.*;
import java.util.*;

public class UVa_10523 {
	             public static Scanner s = new Scanner(System.in);
	             
                public static void main(String args[]){
                	
                	BigInteger sum,A;
                	
                	while(s.hasNext()){
                		sum = new BigInteger("0");
                		
                		int a = s.nextInt();
                		int b = s.nextInt();
                		
                        A = BigInteger.valueOf(b);
                        for(int i=1; i<=a; i++)
                        {
                            sum = sum.add(BigInteger.valueOf(i).multiply(A.pow(i)));
                        }
                        System.out.println(sum);
                    }
                }


            }