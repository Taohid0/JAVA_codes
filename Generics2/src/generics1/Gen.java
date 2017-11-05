package generics1;

public class Gen<T> {
             T ob;
             
             Gen(T o){
            	 this.ob = o;
             }
             
             T getOb(){
            	 return ob;
             }
             
             void showType(){
            	 System.out.println("type of ob is " + ob.getClass().getName());
             }
}
