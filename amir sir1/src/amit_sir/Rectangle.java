package amit_sir;

public class Rectangle extends Shape{
                              
	                    private double length;
                        private double width;
                        
                        Rectangle(String color,double length,double width){
                        	super(color);
                        	this.length = length;
                        	this.width = width;
                        }
                        
                        double area(){
                        	return length*width;
                        }
}
