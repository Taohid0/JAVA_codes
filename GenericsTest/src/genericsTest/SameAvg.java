package genericsTest;

public class SameAvg <T extends Number> {
                                   T nums[];
                                   
                                   SameAvg(T o[]){
                                	   this.nums = o;
                                   }
                                   
                                   double average(){
                                	   double sum = 0.0;
                                	   
                                	   for(int i = 0;i<nums.length;i++){
                                		   sum+=nums[i].doubleValue();
                                	   }
                                	   
                                	   return sum/nums.length;
                                   }
                                   
                                   boolean sameavg(SameAvg<?> ob){
                                	              if(average() == ob.average()){
                                	            	  return true;
                                	              }
                                	              return false;
                                   }
}             
