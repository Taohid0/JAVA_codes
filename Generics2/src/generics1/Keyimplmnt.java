package generics1;

public class Keyimplmnt<K,V> implements Key<K,V> {
                      K k;
                      V v;
                      
                      Keyimplmnt(K k1,V v1){
                    	  this.k = k1;
                    	  this.v = v1;
                      }
                      
                      public K getKey(){
                    	  return k;
                      }
                      public V getValue(){
                    	  return v;
                      }
}                     
