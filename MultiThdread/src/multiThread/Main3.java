package multiThread;

public class Main3 {
               public static void main (String args[]){
            	   
            	   Q q = new Q();
            	   
            	   new Producer(q);
            	   new Consumer(q);
               }
}
