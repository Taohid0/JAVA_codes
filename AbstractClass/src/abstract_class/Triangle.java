package abstract_class;

public class Triangle extends AbstractClass3 {
	
	            Triangle(double c,double d){
	            	super (c,d);
	            }
	            
	            double area(){
	            	System.out.println("inside area of triangle " );
	            	return (dim1*dim2)/2;
	            }

}
