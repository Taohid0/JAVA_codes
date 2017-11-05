package multiThread;

public class Consumer implements Runnable{
                       Q q;
                       
	             Consumer(Q q){
	            	 this.q = q;
	            	 new Thread(this,"consumer").start();
	             }
	             public void run(){
	            	 while(true){
	            		 q.get();
	            	 }
	             }
}
