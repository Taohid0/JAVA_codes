
public class DivideByZero3 {
       public static void main (String args[])
       {
    	   int d,a;
    	   
    	   try{
    		   d = 0;
    		   a = 422/d;
    		   System.out.println ("this will not be printed");
    	   }
    	   catch(ArithmeticException gsdfgfdsgfdg)
    	   {
    		   System.out.println ("divide by zero");
    	   }System.out.println("after try statement");
       }
}
