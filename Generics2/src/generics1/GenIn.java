package generics1;

public class GenIn<T> {
          T ob;
          
          GenIn(T o){
        	  this.ob = o;
          }
          T getOb1(){
        	  return ob;
          }
}
