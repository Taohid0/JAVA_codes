package exception3;

public class Exp7Main {
              public static void main (String args[])
              {
            	  try{
            		   Exp6.demoProc();
            	  }
            	 catch (NullPointerException e)
            	  {
            		 System.out.println("recaught");
            	  }
              }
} 
