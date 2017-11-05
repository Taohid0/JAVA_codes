package generics1;

public class GenIn2<T ,V> extends GenIn<T> {
         
	  V ob2;
	  
	GenIn2(T o1,V o2) {
		super(o1);
		this.ob2 = o2;
	}
	
	V getob2(){
		return ob2;
	}

	

} 
