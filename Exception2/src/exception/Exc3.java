package exception;
import java.util.*;

public class Exc3 {
     public static void main (String args[]){
    	 int a =0,b = 0,c = 0;
    	 Random r = new Random();
    	 
    	 for(int i = 1;i<=1500;i++){
    	 
    	 try{
    		 b = r.nextInt();
    		 c = r.nextInt();
    		 a = 12345/(b/c);
    	 }
    	 catch (ArithmeticException e){
    		 System.out.println("division by zero");
    	 }
    	 System.out.println("a = " + a);
    	 
     }
}}
