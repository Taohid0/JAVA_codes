package multiThreadTest;

public class suspend implements Runnable {
                     Thread t;
                     String name;
                     boolean suspendFlag;
                     
                     suspend(String name){
                    	 this.name= name;
                    	 t = new Thread(this,name);
                    	 t.start();
                     }
                     
                     public void run(){
                    	 try{
                    	 
                    	 for(int i = 10;i>0;i--){
                    		 System.out.println(name +  " : " +i);
                    		 
                    		 Thread.sleep(1000);
                    		 
                    		 synchronized (this){
                    			 while(suspendFlag){
                    				 wait();
                    			 }
                    		 }
                    	 }
                    	 }
                    	 catch(InterruptedException e){
                    		 
                    	 }
                    	 System.out.println(name + " : exiting");}
                    	 
                    	 synchronized void mysuspend(){
                    		 suspendFlag = true;
                    	 }
                    	 synchronized void myResume(){
                    		 suspendFlag = false;
                    		 notify();
                    	 }
}