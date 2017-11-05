
public class Exp7 {
			 
			static void procA()
			{
				try
				{
					System.out.println("inside procA");
					throw new RuntimeException("demo");
				}
				finally{
					System.out.println("inside finally block of procA");
				}
			}
           
           static void procB(){
        	   try
        	   {
        		   System.out.println("inside procB");
        		   return;
        	   }
        	   finally
        	   {
        		   System.out.println("procB finally");
        	   }
        	   
           }
           
           static void procC()
           {
        	  try{
        		  System.out.println("inside procC");
           }
        	  
           finally
           {
        	   System.out.println("inside procC");
           }
           
          }
           public static void main(String args[])
           {
        	   try{
        		   procA();
        	   }
        	  catch(Exception e)
        	   {
        		   System.out.println("exception caught");
        	   }  
        	   procB();
        	   procC();
        	   }
           
}
