package exception3;

public class ExceptionDemo {
	             
                 static void compute (int a) throws MYException1
                 {
                	 System.out.println("called compute " +  a);
                	 
                	 if(a>10){
                		 throw new MYException1(a);
                	 }
                	 System.out.println("normal exit");
                 }
}
