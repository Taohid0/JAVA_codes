package multiThreadTest;

public class Producer implements Runnable{
                        Q1 q;
                        
                        Thread t1;
                        
                        Producer(Q1 q){
                        	this.q = q;
                            t1 = new Thread(this,"producer");
                            t1.start();
                        }
                        public void run(){
                        	
                        		int i = 0;
                        		while(i<10){
                        		q.put(++i);
                        	}
                        		
                        }
}
