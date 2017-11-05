
class A{
		int i,j;
		
		void showij(){
			System.out.println("i and j are "+i+" " +j);
		}
}
class B extends A{
	    int k;
	    
	    void showk(){
	    System.out.println("k is "+ k);}
	    
	    void sum(){
	    	
	    	System.out.println("i+j+k ="+ (i+j+k));
	    }
	    
	    
}

public class Inheritance2 { 
	  public static void main(String args[]){
		  A superOb = new A();
		  B subOb = new B();
		  
		  superOb.i  =10;
		  superOb.j = 20;
		  
		  System.out.println("contents of super class");
		  superOb.showij();
		  System.out.println();
		  
		  subOb.i = 30;
		  subOb.j = 40;
		  subOb.k = 50;
		  
		  System.out.println("contents of subob ");
		  subOb.showk();
		  
		  System.out.print("sum of i,j and k is ");
		  subOb.sum();
	  }

}
