package multiThread;

public class Q {
                           int n;
                           
                           synchronized void get(){
                        	   System.out.println("get  : " +n);
                           }
                           
                           
                           synchronized void put(int n){
                        	   System.out.println("put  : " + n);
                           }
}
