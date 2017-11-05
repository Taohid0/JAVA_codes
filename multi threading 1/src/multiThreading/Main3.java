package multiThreading;

public class Main3 {
          public static void main(String args[]){
        	  new MultipleThreads("one");
        	  new MultipleThreads("two");
        	  new MultipleThreads("three");
        	  
        	  
        	  try{
        		  Thread.sleep(10000);
        	  }
        	  catch(InterruptedException e){
        		  
        	  }
        	  System.out.println("main thread exiting");
          }
}
