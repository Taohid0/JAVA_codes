package generics1;

public class GenCons {
               
	private double val;
	
	<T extends Number> GenCons(T n){
		this.val = n.doubleValue();
	}
	
	void showValue(){
		System.out.println("Value = " + val);
	}
	
}
