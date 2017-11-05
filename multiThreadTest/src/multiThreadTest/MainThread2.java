package multiThreadTest;

public class MainThread2 {
                public static void main(String args[]){
                	
                	
                	Callme t = new Callme();
                	
                	Caller ob1 = new Caller(t,"hello");
                	Caller ob2 = new Caller(t,"syncronized");
                	Caller ob3 = new Caller(t,"world");
                	
                	try{
                		ob1.t.join();
                		ob2.t.join();
                		ob3.t.join();
                	}
                	catch(InterruptedException e)
                	{
                		
                	}
                }
}
