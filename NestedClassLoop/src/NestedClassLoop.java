
class Outer{
	    int outer_x = 10;
	    
	    void test (){
	    	for (int i =1;i<=10;i++){
	    		class Inner{
	    			void display(){
	    			System.out.println("display outer x  = "+outer_x);
	    		}
	    		}
	    		Inner inner  = new Inner();
	    		inner.display();
	    	}
	    }
}

public class NestedClassLoop {
                public static void main(String args[]){
                	Outer outer = new Outer();
                	outer.test();
                }
}
