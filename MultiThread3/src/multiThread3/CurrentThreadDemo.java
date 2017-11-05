package multiThread3;

public class CurrentThreadDemo {
                      public static void main(String args[]){
                    	  
                    	  Thread t = Thread.currentThread();
                    	  
                    	  System.out.println(t);
                    	  
                    	  t.setName("my thread");
                    	  
                    	  System.out.println(t);
                    	  
                    	  try{
                    		  for(int i = 5;i>0;i--){
                    			  System.out.println(i);
                    			  Thread.sleep(1000);
                    		  }
                    	  }
                    	  catch(InterruptedException e){
                    		  System.out.println(e);
                    	  }
                    	  		
                      }
}
