package genrics;

public class Rectangle extends Shape {

	double height,width;
	
	public Rectangle(String color,double height, double width) {
		
		super(color);
		this.height=height;
		this.width=width;
	}
	
	
	public double getArea(double width,double height) {
		area=width*height;
		return area;
	}
	
	
	public String toString() {
		
		return super.toString()+" "+"Area of Rectangle: "+ area;
	}

}
