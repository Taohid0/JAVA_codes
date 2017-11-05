package generics1;

public class NonGenEx<T> extends NonGen {
                       
	               T str;
	               
	               NonGenEx(T s,int i){
	            	   super(i);
	            	   this.str = s;
	               }
	               
	               T getob2(){
	            	 return str;  
	               }
}
