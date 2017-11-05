package multiThreading;

public class Producer implements Runnable {
                 Q q;
                 
                 Producer(Q p){
                	 this.q = p;
                	 new Thread(this,"producer").start();
                 }
                 
                 public void run(){
                	 int i = 0;
                	 
                	while(true){
                		q.put(i++);
                	}
                 }
}
