package exception;

public class Exc5 {
             public static void main (String args[]){
            	 
            	 try
            	 {
            		 int a = 0;
            		 int d = 42/a;
            	 }
            	 
            	 catch (ArithmeticException e)
             	 {
            		 System.out.println("arithmetic Exception");
            	 }
            	 
            	 catch(Exception e){
            		 System.out.println("generic exception class");
            	 }
            	 
            	 
            	 
            	 
             }
}
