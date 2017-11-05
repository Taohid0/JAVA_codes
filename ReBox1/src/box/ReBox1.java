package box;

public class ReBox1 {
            double length;
            double width;
            double depth;
            
            ReBox1(double l,double w,double d){
            	length = l;
            	width = w;
            	depth = d;
            }
            double volume(){
            	return width*depth*length;
            }
}
      
