package genericsTest;

public class TwoGen <T,V> {
                   T ob1;
                   V ob2;
                   
                   TwoGen(T ob1,V ob2){
                	   this.ob1 = ob1;
                	   this.ob2 = ob2;
                   }
                   
                   T getob1(){
                	   return ob1;
                   }
                   V getob2(){
                	   return ob2;
                   }
                   
}
