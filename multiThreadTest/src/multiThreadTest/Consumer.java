package multiThreadTest;

public class Consumer implements Runnable {
          Thread t;
          int n;
          Q1 q;
          
          Consumer(Q1 q)
          {
        	  this.q = q;
        	  t = new Thread(this,"consumer");
        	  t.start();
          }
          
          public void run(){
        	  while(true){
        		  q.get();
        	  }
          }
}
