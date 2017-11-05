package multiThreading;

public class MultipleThreads implements Runnable {
             Thread t;
             String name;
             
             MultipleThreads(String Threadname){
            	 this.name = Threadname;
            	 t = new Thread(this , name);
            	 System.out.println("new thread " + t);
            	 t.start();
            	 }
              
             public void run(){
             try{
            	 for(int i = 5;i>=1;i--){
            		 System.out.println(name +" : " + i);
            		 Thread.sleep(1000);
            	 }}
            	
             catch(InterruptedException e){
            		 System.out.println(e);
            	 
             }
             System.out.println(name + " exiting" );
}
}
