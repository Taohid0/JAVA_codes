package shape;

public class Triangle implements Shape {
                       double a,b,c;
                       
                       Triangle (double a1,double b1,double c1){
                    	   a = a1;
                    	   b = b1;
                    	   c = c1;
                       }
                       public double area(){
                    	   double s = (a+b+c)/2;
                    	   double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                    	   return area;
                       }
                    	   
}
