package multiThread;

import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

public class Main2 {
              public static void main (String args[]){
            	  
            	  
            	  Join j1 =new Join("one");
            	  Join j2 =new Join("two");
            	  Join j3 =new Join ("three");
            	  
       
            	  System.out.println(j1.t.isAlive());
            	  System.out.println(j2.t.isAlive());
            	  System.out.println(j3.t.isAlive());
            	  
            	  try{
            		  j1.t.join();
            		  j2.t.join();
            		  j3.t.join();
            	  }
            	  catch(InterruptedException e ){
            		  
            	  }

            	  System.out.println(j1.t.isAlive());
            	  System.out.println(j2.t.isAlive());
            	  System.out.println(j3.t.isAlive());
              }
}
