package shape;

public class Rectangle implements Shape {
         double length,width;
         
         Rectangle(double w,double l){
        	 length =l;
        	 width = w;
         }
         public double area(){
        	 return length*width;
         }
	
}
