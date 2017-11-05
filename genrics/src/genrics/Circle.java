package genrics;

public class Circle extends Shape {

	double radious;
	
	public Circle(String color, double radious) {
		super(color);
		this.radious=radious;
	}
	
	public double getRadious() {
		return radious;
	}
	
	public double getArea(double radious){
		return area=3.14*radious*radious;
	}
	double area=3.14*radious*radious;
	
	public String toString() {
	
		return super.toString()+" "+"Area of Circlr: "+area;
	}
	
	
}

