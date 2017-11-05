package multiThread3;

public class AliveJoin implements Runnable {
           Thread t;
           String name;
           
           AliveJoin(String name){
        	   this.name = name;
        	   
        	   t = new Thread(this,name);
        	   System.out.println("new thread " + t);
        	   t.start();
           }
           public void run(){
        	   try{
        		   for(int i = 5;i>0;i--){
        			   System.out.println(name + " " +i);
        			   Thread.sleep(1000);
        		   }
        	   }
        	   catch(InterruptedException e){
        		   System.out.println(e);
        	   }
        	   System.out.println("exiting " + name);
           }
}
