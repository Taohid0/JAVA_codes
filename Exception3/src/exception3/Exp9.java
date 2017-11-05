package exception3;

public class Exp9 {
               static void procA()
               {
            	   try{
            		   System.out.println("inside procA");
            		   throw new RuntimeException ("demo");
            	   }
            	   
            	   finally
            	   {
            		   System.out.println("procA finally");
            	   }
               }
               
               static void procB()
               {
            	 try{
            	   System.out.println("inside procB");
            	   return; }
               
               finally
               {
            	   System.out.println("procB finally");
               }
}
               static void procC()
               {
            	   try
            	   {
            		   System.out.println("inside proc C");
            	   }
            	   finally
            	   {
            		   System.out.println("inside procC");
            	   }
               }
               }
