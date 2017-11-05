package multiThreading;

public class NewThread implements Runnable{
	                      
	                    Thread t;
	
	                     NewThread(){
	                        t = new Thread (this,"demo thread");
	                        System.out.println("child thread " + t);
	                        t.start();
	                     }
	                     
	                     public void run(){
	                    	 try{
	                    		 for(int i = 5;i>=1;i--){
	                    			 System.out.println("child thread : "+i);
	                    			 Thread.sleep(500);
	                    		 }
	                    	 }
	                    	 catch(InterruptedException e){
	                    		 System.out.println("interrupted exception has been caught " + e);
	                    	 }
	                    	 System.out.println("exiting child thread");
	                     }

}
