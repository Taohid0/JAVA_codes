package exception;

public class MethodExp {
          public void compute (int a) throws MyException1
          {
        	  System.out.println(a);
        	  
        	  if(a>10)
        	  {
        		  throw new MyException1(a);
        	  }
          }
}
