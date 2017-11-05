package genericsTest;

public class BoundedMain {
                     public static void main(String args[]){
                    	 
                    	 Integer num[] = {10,20,30,40,50,60,100};
                    	 
                    	 Bounded<Integer> iob = new Bounded <Integer>(num);
                    	 
                    	 double result = iob.average();
                    	 
                    	 System.out.println(result);
                    	 
                     }
}
