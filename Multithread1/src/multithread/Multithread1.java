package multithread;

public class Multithread1 {
              public static void main (String args[]){
            	  Thread t  = Thread.currentThread();
            	  
            	  System.out.println("Current thread " +  t);
            	  
            	  t.setName("my thread");
            	  System.out.println("after changing name " + t);
              
              try{
            	  for(int i = 5;i>0;i--){
            		  System.out.println(i);
            		  Thread.sleep(1000);
            	  }}
              catch (InterruptedException e){
            		  System.out.println("main thread interupted");
            	  }
              }
}
