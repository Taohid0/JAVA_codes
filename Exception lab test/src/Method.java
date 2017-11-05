
public class Method {
                 
	          static void compute(int n) throws MyException
	          {
	        	  System.out.println(n);
	        	  
	        	  if(n>10 && n<16)
	        	  {
	        		  throw new MyException(10);
	        	  }
	          }
	
}
