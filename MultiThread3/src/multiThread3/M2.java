package multiThread3;

public class M2 {
          public static void main(String args[]){
        	  
        	  new MultiThread("one");
        	  new MultiThread("two");
        	  new MultiThread ("three");
        	  
        	  try{
        		  Thread.sleep(10000);
        		  
        	  }
        	  catch(InterruptedException e){
        		  System.out.println(e);
        	  }System.out.println("main thread exit");
          }
}
