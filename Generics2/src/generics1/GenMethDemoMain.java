package generics1;

public class GenMethDemoMain {
          public static void main(String args[]){
        	  
        	  GenmethDemo g = new GenmethDemo();
        	  
        	  Integer inums[] = {1,3,5,4,6,5,5};
        	  
        	  if(g.find(5, inums)){
        		  System.out.println("found");
        	  }
        	  else
        		  
        		  System.out.println("not found");
          }
}
