
class Outer{
	 int outer_x = 10;
	 
	 void test(){
		 Inner inner = new Inner();
		 inner.display();
	 }
	 class Inner{
		 void display(){
			 System.out.println("display outer "+ outer_x);
		 }
	 }
}

public class Inner_Outer {
     public static void main(String args[]){
    	 Outer outer  =new Outer();
    	 outer.test();
     }
}
