
class A{
	int i,j;
	
	void showij(){
		System.out.println("i and j :" +i + " " +j);
	}
}
class B extends A{
	int k;
    void showk(){
    	System.out.println("k: " + k);
    }
    void sum(){
    	System.out.println("i+j+k = " + (i+j+k));
    }
}

public class Inheritance {
   public static void main(String args[]){
	   A superob = new A();
	   B subob = new B();
	   
	   superob.i = 10;
	   superob.j = 20;
	   System.out.println("contents of superob");
	   superob.showij();
	   System.out.println();
	   
	   subob.i = 10;
	   subob.j = 20;
	   subob.k = 30;
	   System.out.println("contents of superob");
	   superob.showij();
	   subob.showk();
	   System.out.println();
	   
	   subob.sum();
	   
   }
}
