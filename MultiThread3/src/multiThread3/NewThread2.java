package multiThread3;

public class NewThread2 extends Thread {
                          
	        NewThread2(){
		               super("thread demo 2");
		               System.out.println("child thread " + this);
		               start();
	}
	        public void run(){
	        	try{
	        		for(int i = 5;i>0;i--){
	        			System.out.println(i);
	        			Thread.sleep(500);
	        		}
	        	}
	        	catch(InterruptedException e){
	        		System.out.println(e);
	        	}
	        	System.out.println("exiting child thread");
	        }
}
