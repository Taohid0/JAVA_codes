package over;
import java.util.*;

public class Over {
          public static void main (String args[]){
              double len,wid,high;
              
        	  Scanner input = new Scanner(System.in);
        	  
        	  System.out.println("enter length");
        	  len = input.nextDouble();
        	  
        	  System.out.println("enter width");
        	  wid =input. nextDouble();
        	  
        	  System.out.println("enter height");
        	  high = input.nextDouble();
        	  
        	  OverDemo myBox1 = new OverDemo(len,wid,high);
        	  OverDemo myBox2 = new OverDemo(len);
        	  OverDemo myBox3 = new OverDemo();
        	  
        	  System.out.println("volume with parameterised constructor " + myBox1.volume() + "\nvolume with one parameter " + myBox2.volume() +  "\nvolume with no parameter " + myBox3.volume());
              
        	  input.close();
           }
}
