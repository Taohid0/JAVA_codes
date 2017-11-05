
public class Exc4 {
             static void demoproc(){
            		 
            		try{
            		 throw new NullPointerException ("demo");
            	 }
            		catch (NullPointerException e)
            		{
            			System.out.println("null pointer exception has been caught");
            			throw e;
            		}
            	
             }
             
             public static void main(String args[])
             {
            	 try{
            		 demoproc();
            	 }
            	 catch(NullPointerException e)
            	 {
            		 System.out.println("null pointer Exception has been again caught");
            	 }
             }
}
