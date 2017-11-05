
class Outer{
	int outer_x = 10;
	
	void test(){
		
			class Inner{
				for(int i=1;i<=10;i++){
				void display(){
					System.out.println("outer x is " + i);
						
					}
				}
			
			}Inner inner = new Inner();
			inner.display();
		}
	}


    public class Inner_Outer3 {
           public static void main(String args[]){
	 Outer outer = new Outer();
	 outer.test();
 }
}
