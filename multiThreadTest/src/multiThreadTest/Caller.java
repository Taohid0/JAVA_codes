package multiThreadTest;

public class Caller implements Runnable {
                    String msg;
                    Thread t;
                    Callme target;
                    
                    Caller(Callme target,String msg){
                    	this.msg = msg;
                    	this.target =target;
                    	t =  new Thread(this);
                    	t.start();
                    }
                    public void run(){
                    	 target.call(msg);
                    }
}
