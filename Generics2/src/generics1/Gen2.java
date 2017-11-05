package generics1;

public class Gen2<T,V> {
              T ob1;
              V ob2;
              
              Gen2(T o1,V o2){
            	  this.ob1 = o1;
            	  this.ob2 = o2;
              }
              
              void showType(){
            	  
            	  System.out.println("type of T is "+ob1.getClass().getName());
            	  
            	  System.out.println("typw of V is "+ob2.getClass().getName());
              }
              
              T getOb1(){
            	  return ob1;
              }
              V getOb2(){
            	  return ob2;
              }
}
