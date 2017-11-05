package abstract_class;

public class AbstractClassMain2 {
                      public static void main (String args[]){
                    	  
                    	  Rectangle r = new Rectangle (10,20);
                    	  Triangle t = new Triangle (10,20);
                    	  
                    	  AbstractClass3  figure  = t;
                    	  
                    	  System.out.println("area is " + r.area());
                    	  System.out.println("Area is " + figure.area());
                    	  
                      }
}
