
class Outer{
	int outer_x = 10;
	
	class Inner{
		void display(){
			System.out.println("Outer x is " + outer_x);
		}
	}
	void test(){
	Inner inner = new Inner();
	inner.display();
}}

public class Inner_Outer2 {
    public static void main(String args[]){
    		Outer outer = new Outer();
    		outer.test();
    }
}
