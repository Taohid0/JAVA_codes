package generics;

public class Gen <T>{
          T ob;
          
          Gen(T o){
        	  this.ob = o;
          }
          
          T getOb(){
        	  return ob;
          }
          
          void showType(){
        	  System.out.println("type of t is " + ob.getClass().getName());
          }
}
