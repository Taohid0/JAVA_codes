package multiThread3;

public class NewThread implements Runnable{
         Thread t;
         
         NewThread(){
        	 t = new Thread(this,"demo thread");
        	 System.out.println("child thread " + t);
        	 t.start();
         }
         public void run(){
        	  for(int i =5;i>0;i--){
        		  System.out.println(i);
        		  try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	  } 
        	  System.out.println("exiting child thread");
        	  
         }
        
}
