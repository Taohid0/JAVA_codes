package exception3;

public class Exp8Main {
             public static void main (String args[])
             {
            	 try
            	 {
            		 Exp8.throwOne();
            	 }
            	 catch (IllegalAccessException e)
            	 {
            		 System.out.print("caught " + e);
            	 }
             }
}
