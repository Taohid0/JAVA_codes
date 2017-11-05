package thread;

public class MainThread {
             public static void main (String args[]){
            	 
            	 Thread t = Thread.currentThread();
            	 
            	 System.out.println("Current thread " + t);
            	 
            	 t.setName("my thread");
            	 
                 System.out.println("after changing the name " + t);
                 
                 try{
                	 for(int i = 1;i<=10;i++){
                		 System.out.println(i);
                		 Thread.sleep(1000);
                	 }
                 }
                 catch (InterruptedException e){
                	 System.out.println("main thread interrupted");
                 }
                 
                 
             }
}
