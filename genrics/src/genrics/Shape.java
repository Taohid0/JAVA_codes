package genrics;

public class Shape {
	
	String color;
	double area;
	
	public Shape() {
		
	}
	
	public Shape(String color) {
		this.color = color;
		
	}

	public String getColor(){
		return color;
	}
	
	public double getArea() {
		return area;
		
	}
	
	public String toString() {
		
		return "colour: "+ color;
	}
}

