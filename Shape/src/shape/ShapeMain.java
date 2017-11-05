package shape;
import java.util.*;
  
public class ShapeMain {
	
        	static Scanner s = new Scanner(System.in);
	
             public static void main (String args[]){
        	  
        	// Scanner s = new Scanner(System.in);
        	  
        	  double length,width,radius,a,b,c;
        	  
            //	 Scanner s = new Scanner(System.in);
        	  
        	  System.out.println("enter length and width of the rectangle");
        	  length = s.nextDouble();
        	  width = s.nextDouble();
        	  
        	  Rectangle r = new Rectangle (length,width);
        	  
        	  System.out.println("enter the value of a,b and c of a triangle");
        	  a =  s.nextDouble();
        	  b = s.nextDouble();
        	  c = s.nextDouble();
        	  
        	  Triangle t = new Triangle (a,b,c);
        	  
        	  System.out.println("enter the valur of a circle");
        	  radius = s.nextDouble();
        	  Circle cr = new Circle (radius);
        	  
        	  System.out.println("area of the rectangle is "+r.area());
        	  System.out.println("area of the tricngle is "+ t.area());
        	  System.out.println("area of the circle is " + cr.area());
        	  
        	  partialinterface2 p = new partialinterface2 ();
        	  
        	System.out.println(p.area());
          }
}
