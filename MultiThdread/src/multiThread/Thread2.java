package multiThread;

public class Thread2 extends Thread{
                    
	public void run(){
		   try {
			   for(int i = 5;i>0;i--){
				   
				   System.out.println("child thread " + i);
				   Thread.sleep(200);
		   }
			
		}
		   catch(InterruptedException e){
			   
		   }
	}
}
