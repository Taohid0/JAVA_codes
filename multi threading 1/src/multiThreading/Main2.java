package multiThreading;

public class Main2 {
	 public static void main(String args[]){
     	
     	new NewThread();
     	
     	try{
     		for(int i = 5;i>=1;i--){
     			System.out.println("main thread " +  i);
     			Thread.sleep(501);
     		}
     		
     	}
     	catch(InterruptedException e)
     	{
     		System.out.println(e);
     	}
     	
     	System.out.println("exiting main thread");
     }
}
