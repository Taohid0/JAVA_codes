package genericsTest;

public class Gen <T>{
               T ob;
               
               public Gen(T i) {
			        this.ob = i;
			}

			T getob(){
            	   return ob;
               }
}
