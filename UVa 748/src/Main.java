import java.util.*;
import java.math.*;

public class Main {
           public static void main (String [] args)
           {
        	   Scanner sc = new Scanner(System.in);
        	   int a;
        	   BigDecimal b;
        	   
        	   while(sc.hasNext())
        	   {
        		   b = sc.nextBigDecimal();
        		   a =sc.nextInt();
        		   
        		    String s = b.pow(a).toPlainString();
        		   
        		   int len = (int)s.length(),first=0,last=len-1;
        		   boolean f= false,l =false;
        		   
        		   for(int i = 0;i<len;i++)
        		   {  
        			  if(s.charAt(i)!='0')break;
        			
        				  first++;
        		   }
        		   for(int i = len-1;i>=0;i--)
        		   {
        			   if(s.charAt(i)!='0')break;
        				   last--;
        		   }
        		  
        		   for(int i =first;i<=last;i++)
        		   {
        			   System.out.print(s.charAt(i));
        		   }
        		   System.out.println();
        		   
        	   }
           }
}
