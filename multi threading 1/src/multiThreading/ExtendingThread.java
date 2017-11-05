package multiThreading;

public class ExtendingThread extends Thread {
                     
	               ExtendingThread(){
	            	   super("demo thread");
	            	   System.out.println("child thread " + this);
	            	   start();
	               }
	               
	               public void run(){
	            	  try{
	            		  for (int i=5;i>=1;i--){
	            	  
	            		  System.out.println("child thread " + i);
	            		  Thread.sleep(500);
	            		  }
	            		  
	            	  }
	            	  catch(InterruptedException e){
	            		  System.out.println(e);
	            	  }
	            	  System.out.println("exiting child thread");
	               }
}
