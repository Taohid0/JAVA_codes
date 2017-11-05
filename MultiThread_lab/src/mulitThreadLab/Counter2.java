package mulitThreadLab;

public class Counter2 implements Runnable {
                     public void run(){
                    	 while(MainMulti.count<=100){
                    		 System.out.println("count 2 : " + MainMulti.count++);
                    		 try {
 								Thread.sleep(2);
 							} catch (InterruptedException e) {
 							
 							}
                    	 }
                     }
}
