package arif;


public class Main {
	
	int s = 0;
	
	public static void main(String[] args) {
		
		int i = 0;
		
		
		threadExample tee = new threadExample(i);
		tee.start();
		
		Thread ee = new Thread(new Runnablee(i), "a");	
		ee.start();
		
		
	/*	for (int i = 5; i >= 0; i--) {
			System.out.println("main thread: " + i);
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException te) {
				
			}
		}*/
		

	}

}
