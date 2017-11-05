package abstract_class;

public class Rectangle extends AbstractClass3{
              Rectangle (double a,double b){
            	  super(a,b);
              }
              double area(){
            	  System.out.println("inside area of the rectangle ");
            	  return dim1*dim2;
              }
}               

