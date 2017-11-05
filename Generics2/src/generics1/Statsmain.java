package generics1;

public class Statsmain {
          public static void main(String args[]){
        	  
        	  Integer inums[] = {4,54,54,34,3,43,4,354,35,4};
        	  Stats<Integer>iob = new Stats <Integer>(inums);
        	  
        	  System.out.println( iob.average());
        	 
        	  Double dnums[] = {1.1,3.1,.2,2410.0};
        	  
        	  Stats<Double>dob = new Stats<Double>(dnums);
        	  
        	  System.out.println(dob.average());
          }
}
