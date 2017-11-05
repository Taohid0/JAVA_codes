package multiThreading;

public class Q1 {
                  
	int n;
	boolean valueSet = false;
	
	synchronized int get(){
		while(!valueSet){
			try{
				wait();
			}
			catch(InterruptedException e){
				
			}
		}
		System.out.println("got " + n);
		valueSet = false;
		notify();
		return n;
		
	}
}
