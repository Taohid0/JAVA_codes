
public class MyException extends Exception {
                    
	                int n; 
	
	                MyException(int num)
                    {
                    	n  = num;
                    }
	                
	                public String toString()
	                {
	                	return "hare cause "+n;
	                }
}
