package multiThreadTest;

public class Pq {
             public static void main(String args[]){
            	 
            	 Q1 q = new Q1();
            	 
            	 new Producer(q);
            	 new Consumer(q);
             }
}
