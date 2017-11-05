package genericsTest;

public class Bounded <T extends Number> {
                     T nums[];
                     
                     Bounded(T o[]){
                    	 this.nums = o;
                     }
                     
                     double average(){
                    	 double sum  =0;
                    	 
                    	 for(int i = 0;i<nums.length;i++){
                    		 sum+=nums[i].doubleValue();
                    	 }
                    	 return sum/nums.length;
                    	 }
                     }
