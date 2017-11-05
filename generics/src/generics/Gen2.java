package generics;

public class Gen2<T> {
               
	T ob;
	
	Gen2(T o){
		ob = o;
	}
	
	T getOb(){
		return ob;
	}
	
	void showOb(){
		System.out.println("type of T is " + ob.getClass().getName());
	}
	
	
}
