
public class Exc3 {
                 public static void main(String args[])
                 {
                	 int a = args.length;
                	  
                	 try
                	 {    int c[] = {1};
                	 
                		  int b = 42/a;
                		  c[50] = 5;
                	 }
                	 catch (ArithmeticException e)
                	 {
                		 System.out.println("Arithmetic exception");
                	 }
                	 catch (ArrayIndexOutOfBoundsException e)
                	 {
                		 System.out.println("array index out of bound exception");
                	 }
                 }
}
