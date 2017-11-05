package multiThread;

public class Main {
            public static void main(String args[]){
            	
            	 Multiple t1 =  new Multiple("one");
            	 Multiple t2 = new  Multiple("two");
            	 Multiple  t3 = new Multiple("three");
            	
            	 
            	 System.out.println(t1.isAlive());
            	 System.out.println(t2.isAlive());
            	 System.out.println(t1.getName());
                 try{
                	 Thread.sleep(1000);
                 }
                 catch(InterruptedException e){
                	 
                 }
                
            }}


