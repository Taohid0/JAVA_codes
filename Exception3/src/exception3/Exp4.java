package exception3;

public class Exp4 {
             public static void main (String args[])
             {
            	 try{
            		 int a,d = 0;
            		 a = 42/d;
            		 
            	 }
            	 
            	 catch (ArithmeticException e)
            	 {
            		 System.out.println("arithmetic exception");
            	 }
            	 
            	 catch(Exception e)
            	 {
            		 System.out.println("generic exception caught");
            	 }
            	 
             }
}
