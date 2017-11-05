package multiThread;

public class MultiThreadDemo {
                      public static void main (String args[])
                      {
                    	  new MultiThread2("one");
                    	  new MultiThread2("two");
                    	  new MultiThread2("three");
                      
                      
                      try
                      {
                    	  for(int j = 5;j>=1;j--)
                    	  {
                    		  Thread.sleep(1);
                    	  }
                      }
                      catch (InterruptedException e)
                      {
                    	  System.out.println("main thread interrupted");
                      }
                      System.out.println("main thread exiting");
}  
}