package Overload;
import java.util.*;

public class Overload2 {
              public static void main (String args[]){
            	  int a,b;
            	  double n;
            	  
            	  Scanner inpt =  new Scanner(System.in);
            	  
            	  OverloadDemo MyOverload = new OverloadDemo();
            	 
            	  System.out.println("enter a intiger value");
            	  a = inpt.nextInt();
            	  
            	  System.out.println("enter another integer values");
            	  b = inpt.nextInt();
            	 
                  System.out.println("enter a double value");
            	  n = inpt.nextDouble();
            	  
            	  //System.out.println("no parameter " + "one parameter : " + MyOverload.test() );
            	  
            	  //System.out.println("one parameter - " + MyOverload.test(a) + "\ntwo parameters - " + MyOverload.test(b,a) + "\none double parameter - " + MyOverload.test(n));
                  MyOverload.test(n);
                  MyOverload.test(a);
                  MyOverload.test(a,b);
                  
                  inpt.close();
}
}
