package multiThread;

public class MultiThread2 implements Runnable {
                    
	            String name;
	            Thread t;
	            
	            MultiThread2(String threadName)
	            {
	            	name = threadName;
	            	t = new Thread (this,name);
	            	System.out.println("new thread " + t);
	            	t.start();
	            }
	            
	            public void run()
	            {
	            try
	            {
	            	for(int i =5;i>=1;i--)
	            	{
	            		System.out.println("name : " + i);
	            		Thread.sleep(1000);
	            	}
	            }
	            catch (InterruptedException e)
	            {
	            	System.out.println(name + " interrupted");
	            }
	            System.out.println(name + " exiting");
}
}
