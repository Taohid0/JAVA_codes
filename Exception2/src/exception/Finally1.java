package exception;

public class Finally1 {
                   static void procA(){
                	   try
                	   {
                		   System.out.println("inside procA");
                		   throw new RuntimeException("demo");
                	   }
                	   finally{
                		   System.out.println("procA Finally");
                	   }
                   }
                   
                   static void procB(){
                	   try
                	   {
                		   System.out.println("inside ProcB");
                		   return;
                	   }
                	   finally
                	   {
                		   System.out.println("ProcB finally");
                	   }
                   }
                   
                   static void ProcC(){
                	   try
                	   {
                		   System.out.println("inside procC");
                	   }
                	   finally
                	   {
                		   System.out.println("ProcC finally");
                	   }
                   }
                   
                  public static void main (String args[]){
                	 
                	  try
                	  {
                		  procA();
                	  }
                	  catch (RuntimeException e)
                	  {
                		  System.out.println("Exception caught " + e);
                	  }
                	  
                      procB();
                      ProcC();
                      
                      
                  }
}