package multiThread3;

public class MultiThread implements Runnable{
                    String name;
                    Thread t;
                    
                    MultiThread(String name){
                    	this.name = name;
                    	t = new Thread (this,name);
                    	t.start();
                    }
                    
                    public void run(){
                    	for(int i = 5;i>0;i--){
                    		System.out.println(i);
                    		try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                    	}
                    System.out.println("exiting " + name);
                    }
}
