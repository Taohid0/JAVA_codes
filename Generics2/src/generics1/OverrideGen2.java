package generics1;

public class OverrideGen2<T> extends OverrideG<T>{
                           
	                OverrideGen2(T o){
	                	super(o);
	                }
	                
	                T getob2(){
	                	System.out.println("ob2 getob : ");
	                	return ob;
	                }
}
