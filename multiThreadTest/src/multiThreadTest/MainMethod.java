package multiThreadTest;

public class MainMethod {
               public static void main(String args[]){
            	    NewThread t1 = new NewThread("one");
            	    NewThread t2 = new NewThread("two");
            	    NewThread t3 = new NewThread("three");
            	   
            	    {
            	    	try{
            	    		t1.t.join();
            	    		t2.t.join();
            	    		t3.t.join();
            	    	}
            	    	catch(InterruptedException e){
            	    		
            	    	}
            	    }
            	   
               }
}
