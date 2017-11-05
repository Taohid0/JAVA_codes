package lab;

public class Square extends Shape{
                     
	             double arm;
	             
	             Square(String color,double arm){
	            	 super(color);
	            	 this.arm = arm;
	             }
	             public double getArea(){
	            	 area = arm*arm;
	            	 return area;
	             }
	             public String toString(){
	            	 return "area of square is " + area;
	             }
}
