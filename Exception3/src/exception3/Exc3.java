package exception3;

public class Exc3 {
           public static void main (String args[])
           {
        	   try{
        	   int a = args.length;
        	   System.out.println("a = :" + a);
        	   int b = 42/a;
        	   int c[] = {1};
        	   c[42] = 50;
           }
        	   
           catch(ArithmeticException e)
        	   {
        	   System.out.println("dividion by zero " +e);
        	   }
        	catch(ArrayIndexOutOfBoundsException e)
        	   {
        		System.out.println("array index out of bound " + e);
        	   }
           }
           
}
