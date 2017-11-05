package generics;

public class WildCardDemo {
              public static void main(String args[]){
            	  
            	  Float inums[] = {1.0f,2.0f,3.0f,5.0f,5.0f};
            	  
            	  Stats2<Float> iob = new Stats2<Float>(inums);
            	  
            	  double v = iob.average();
            	  
            	  System.out.println("average of iob is " + iob.average());
            	  
            	  Double[] dnums ={1.1,2.2,2.3,1.5};
            	  
            	  
            	  Stats2<Double>dob = new Stats2<Double>(dnums);
            	  
            	  System.out.println("average of dob is " + dob.average());
            	  
            	  if(dob.sameAverage(iob)){
            		  System.out.println("same");
            	  }
            	  else
            		  System.out.println("not same");
            	  
              }
}
