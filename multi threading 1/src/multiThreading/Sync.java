package multiThreading;

public class Sync { 
	                
	           public static void main(String args[]){
	        	   
	        	   CallMe c = new CallMe();
	        	   
	        	   Caller c1 = new Caller(c,"hello");
	        	   Caller c2  = new Caller(c,"synchronized");
	        	   Caller c3 = new Caller(c,"world");
	        	   
	        	   
	        	  try{
	        		  c1.t.join();
	        		  c2.t.join();
	        		  c3.t.join();
	        		  
	        	  }
	        	   catch(InterruptedException e){
	        		   
	        	   }
	           }

} 
