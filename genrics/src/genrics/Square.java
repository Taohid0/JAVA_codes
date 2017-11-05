package genrics;

public class Square extends Shape {

	double arm;
	
	public Square(String color, double arm) {
		super(color);
		this.arm=arm;
	}
	

public double getArea(double arm) {
	
	return area = arm*arm;
}


public String toString() {
	
	return super.toString()+" "+"Area of Square: "+ area;
}
	
}
