package multiThread;

public class Join implements Runnable {
                          String name;
                          Thread t;
                          
                          Join(String name){
                        	  this.name  = name;
                        	  t = new Thread (this,name);
                        	  t.start();
                        
                          }
                          
                          public void run(){
                        	  for(int i = 5;i>0;i--){
                        		  System.out.println(name +  " : " + i);
                        		  try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									
								}
                        	  }
                        	  System.out.println(name + "  " + "exiting");
                          }
}
