
public class Prime {
     public static void main (String args[])
     {
    	 int num = 1;
    	 boolean isPrime=true;
    	 int i;
    	 if(num<2)
    	 {
    		 isPrime = false;
    	 }
    	 
    	 for(i=2;i<=num/i;i++)
    	 {
    		 if(num%i==0)
    		 {
    			 isPrime = false;
    			 break;
    		 }
    		 
    	 }
    	 if(isPrime)
    	 {
    		 System.out.println("yes,it is a prime number");
    	 }
    	 else
    		 System.out.println("No,it's not a prime number");
     }
}
