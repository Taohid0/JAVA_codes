package multiThread;

public class Producer implements Runnable {
                 Q q;
                 
                 Producer(Q q){
                	 this.q = q;
                	 new Thread (this,"producer");
                 }
                 public void run(){
                	 int i = 0;
                	 
                	 while(true){
                		 q.put(i++);
                	 }
                 }
}
