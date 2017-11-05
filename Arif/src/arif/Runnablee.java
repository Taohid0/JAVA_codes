package arif;

public class Runnablee implements Runnable {
	
	int s;
	
	public Runnablee (int a) {
		this.s = a + 1;
	}
	
	public void run() {
		
		
		
		for(;s <= 100;s++){
			System.out.println("Runnable thread: "  + s++);
			
			try {
				Thread.sleep(20);
			}
			catch (InterruptedException e) {
				
			}
		
		}
		
	}
	
	
}