package multiThreading;

public class main {
            public static void main(String args[]){
            	
            	NewThread0 n1 = new NewThread0("one");
            	NewThread0 n2   = new NewThread0("two");
            	
            	try{
            		Thread.sleep(1000);
            	 	n1.mySuspend();
            		
            		System.out.println("suspending thread one");
            		//n1.myResume();
            		n2.mySuspend();
            		
            	
            	
            	
            }catch(InterruptedException e){
            }
            }
}