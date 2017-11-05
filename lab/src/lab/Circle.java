package lab;

public class Circle extends Shape{
                 
	             double radius;
	             
	             Circle(String color,double radius){
	            	 super(color);
	            	 this.radius = radius;
	             }
	             
	             public double getArea(){
	            	 area = 3.1416*radius*radius;
	            	 return area;
	             }
	             public String toString(){
	            	 return "area of the circle is " + area;
	             }
}
