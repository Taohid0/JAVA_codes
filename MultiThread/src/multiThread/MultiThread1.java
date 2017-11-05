package multiThread;

public class MultiThread1 {
            public static void main (String args[])
            {
            	Thread t   = Thread.currentThread();
            	
            	System.out.println("current thread " + t);
            	
            	t.setName("my thread");
            	
            	System.out.println("name of my thread is " + t);
            	
            	try{
            		for(int i = 1;i<=5;i++){
            			System.out.println(i);
            			Thread.sleep(100);
            			
            		}
            	}
            	catch (InterruptedException e)
            	{
            		System.out.println("main thread interupted");
            	}
            	
            }
}
