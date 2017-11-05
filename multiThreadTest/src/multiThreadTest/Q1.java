package multiThreadTest;

public class Q1 {
              int n;
              boolean valueset = false;
              
              synchronized void get(){
            	  while(!valueset){
            		  try{
            			  wait();
            		  }
            		  catch(InterruptedException e){
            			  
            		  }
            	  }
            	  System.out.println("get : " + n);
            	  valueset = false;
            	  notify();
              }
              synchronized void put(int n){
            	  this.n = n;
            	  while(valueset){
            		  try{
            			  wait();
            		  }
            		  catch(InterruptedException e){
            			  
            		  }
            	  }
            	  
            	  System.out.println("put : " + n);
            	  valueset = true;
            	  notify();
              }
}
