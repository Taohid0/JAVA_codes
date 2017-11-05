package amit_sir;
import java.util.*;

public class Iterator2 {
              public static void main(String args[]){
            	  
            	  ArrayList<Integer>a =new ArrayList<Integer>();
            	  
            	  a.add(10);
            	  a.add(15);
            	  a.add(20);
            	  
            	  Iterator<Integer> itr =a.iterator();
            	  
            	  while(itr.hasNext()){
            		  Object obj = itr.next();
            		  System.out.println(obj);
            	  }
            	  
            	  
              }
} 
