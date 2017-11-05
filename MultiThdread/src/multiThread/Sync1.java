package multiThread;

public class Sync1 {
               
	public static void main(String args[]){
		
		Callme trgt = new Callme();
		
		Caller c1 = new Caller(trgt,"hello");
		Caller c2 = new Caller(trgt,"sync");
		Caller c3 = new Caller(trgt,"world");
                
		try{
			c1.t.join();
			c2.t.join();
			c3.t.join();
		}
		catch(InterruptedException e){
			
		}
	}
	
	}

