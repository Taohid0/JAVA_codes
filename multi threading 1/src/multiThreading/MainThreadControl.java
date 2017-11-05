package multiThreading;

public class MainThreadControl {
                     public static void main(String args[]){
                    	 
                    	 Thread t = Thread.currentThread();
                    	 
                    	 System.out.println(t);
                    	
                    	 t.setName("my thread");
                    	 
                    	 System.out.println("after setting name : "+ t);
                    	 System.out.println(t.getName());
                    	 try{
                    		 for(int i = 5;i>=1;i--){
                    			 System.out.println(i);
                    			 Thread.sleep(1000);
                    		 }
                    	 }
                    	 catch(InterruptedException e){
                    		 System.out.println("interrupted exception " + e);
                    	 }
                     }
}
