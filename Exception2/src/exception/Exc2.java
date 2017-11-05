package exception;

public class Exc2 {
             public static void main (String args[]){
            	 int a,d;
            	 
            	 try{
            		 d = 0;
            		 a = 42/d;
            		 System.out.println("this will not be printed");
            	 } 
            	 
            	 catch (ArithmeticException e)
            	 {
            		 System.out.println("divide by zero " + e);
            	 }
            	
            	 
             }
}
