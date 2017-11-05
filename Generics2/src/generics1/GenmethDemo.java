package generics1;

public class GenmethDemo {
       <V,T extends V> boolean find(T x,V y[]){
    	    
    	   for(int i = 0;i<y.length;i++){
    		   if(x.equals(y[i])){
    			   return true;} }
    		   
    		   return false;
    	
       }
}
