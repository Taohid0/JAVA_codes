package exception3;
import java.util.*;

public class Exception {
                  static Scanner r = new Scanner(System.in);
                  
                  public static void main (String args[])
                  { 
                 try{
                	  ExceptionDemo.compute(r.nextInt());
                	  ExceptionDemo.compute(r.nextInt());
                  }
                  
                  catch (MyException1 e)
                  {
                	  System.out.println("caught " + e);
                  }
}}
