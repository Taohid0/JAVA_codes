package shape;

public class Circle implements Shape {
           double radius;
           
           Circle(double r){
        	   radius = r;
           }
           public double area(){
        	   return PI*radius*radius;
           }
}
