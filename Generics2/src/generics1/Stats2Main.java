package generics1;

public class Stats2Main {
                      public static void main(String arge[]){
                    	  
                    	  Integer inums[] = {1,2,3};
                    	  
                    	  Stats2<Integer>iob = new Stats2 <Integer>(inums);
                    	  
                    	  System.out.println(iob.avrage());
                    	  
                    	  Double dnums[] = {1.0,2.0,3.0};
                    	  
                    	  Stats2<Double>dob = new Stats2<Double>(dnums);
                    	  System.out.println(dob.avrage());
                    	  
                    	  if(iob.sameAvg(dob)){
                    		  System.out.println("same average");
                    	  }
                    	  
                    	  if(dob.sameAvg(iob)){
                    		  System.out.println("same average");;
                    	  }
                    	  
                      }
}
