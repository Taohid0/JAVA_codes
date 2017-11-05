package multiThread;

public class ThreadDemo {
                  public static void main (String args[])
                  {
                	  new NewThread();
                	  
                	  try
                	  {
                		  for(int j = 5;j>=1;j--)
                		  {
                			  System.out.println("main thread :"+j);
                			  Thread.sleep(200);
                		  }
                	  }
                	  catch (InterruptedException er)
                	  {
                		  System.out.println("main thread interrupted");
                	  }
                	  System.out.println("main thread exiting");
                  }
}
