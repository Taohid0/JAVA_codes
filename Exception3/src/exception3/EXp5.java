package exception3;

public class EXp5 {
             public static void main (String args[])
             {
            	 try
            	 {
            		 int a = args.length;
            		 int b = 42/a;
            		 
            		 System.out.println("a = "+a);
            		 
                     try
                     {
                    	 if (a==1)
                    	 {
                    		b = (a-a); 
                    	 }
                    	 
                    	 
                    	 if(a==2)
                    	 {
                    		 int c[] = {1};
                    		 c[42]=99;
                    	 }
                     }
                     catch (ArrayIndexOutOfBoundsException e)
                     {
                    	 System.out.println("array index out of bound");
                     }
                    
                     
            	 }
            	 catch (ArithmeticException e)
            	 {
            		 System.out.println("arithmetic exception ");
            	 }
             }
}
