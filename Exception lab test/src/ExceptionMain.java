
public class ExceptionMain {
                 public static void main (String args[])
                 {
                	 
                	 try{
                		 Method.compute(100);
                		 Method.compute(13);
                	 }
                	 
                	 catch(MyException e)
                	 {
                		 System.out.println("my exception "+e);
                	 }
                	 
                	 
                 }
}
