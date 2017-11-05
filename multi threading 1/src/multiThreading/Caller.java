package multiThreading;

public class Caller implements Runnable{
                      String msg;
                      CallMe target;
                      Thread t;
                      
                      Caller(CallMe targ,String msg){
                    	  this.target = targ;
                    	  this.msg=msg;
                    	  t = new Thread(this);
                    	  t.start();
                      }
                      public void run(){
                    	  synchronized(target){
                    		  
                    	  
                    	  target.call(msg);
                      }}
}
