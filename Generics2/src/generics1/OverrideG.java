package generics1;

public class OverrideG<T> {
             T ob;
             
             OverrideG(T o){
            	 this.ob = o;
             }
             T getOb(){
            	 System.out.println("ob1 getOb  : ");
            	 return ob;
             }
}
