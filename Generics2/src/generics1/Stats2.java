package generics1;

public class Stats2<T extends Number> {
                          
	                T nums[];
	                
	                Stats2(T o[]){
	                	this.nums = o;
	                }
	                
	                double avrage(){
	                	double sum = 0.0;
	                	
	                	for(int i = 0;i<nums.length;i++){
	                		sum+=nums[i].doubleValue();
	                	}
	                	return sum/nums.length;
	                }
	                
	                boolean sameAvg(Stats2<?>ob){
	                	if(avrage()==ob.avrage())
	                		return true;
	                	return false;
	                }
}
