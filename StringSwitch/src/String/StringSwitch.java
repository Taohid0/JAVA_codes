package String;
import java.util.*;


public class StringSwitch {
	 public static void main(String args[])
	   {
	      int a;
	      float b;
	      String s;
	 
	     Scanner r = new Scanner(System.in);
	 
	      System.out.println("Enter a string");
	      s = r.nextLine();
	      System.out.println("You entered string "+s);
	 
	      System.out.println("Enter an integer");
	      a = r.nextInt();
	      System.out.println("You entered integer "+a);
	 
	      System.out.println("Enter a float");
	      b = r.nextFloat();
	      System.out.println("You entered float "+b);   
	   }
	}