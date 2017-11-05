package lab;

public class Rectangle extends Shape {
                
	    double length;
	    double width;
	    
	
	
	Rectangle(String color,double length,double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	double area(){
		area = length*width;
		return area;
	}
	
	public String toString(){
		return "area is "+area;
	}
                        
}
