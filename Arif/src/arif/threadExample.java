package arif;

public class threadExample extends Thread{
	
	int s;
	
	public threadExample (int i) {
		this.s = i;
	}
	
	
	public void run() {
		
		for (;s <= 100;s++){
			
		System.out.println("what a thread: " + s++);
		try {
			Thread.sleep(20);
		}
		catch(InterruptedException ea) {
			
		}
		
		}
		
	}
}
