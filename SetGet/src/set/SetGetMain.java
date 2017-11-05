package set;
import java.util.*;

public class SetGetMain {
           public static void main (String args[]){
        	   Scanner input = new Scanner(System.in);
        	   
        	   double valuea = input.nextDouble();
        	   double valueb = input.nextDouble();
        	   double valuec =  input.nextDouble();
        	   
        	   SetGet setGet = new SetGet();
        	   
        	   setGet.seta(valuea);
        	   setGet.setb(valueb);
        	   setGet.setc(valuec);
        	   
        	   System.out.println(setGet.geta()+" "+setGet.getb()+" "+setGet.getc());
        	   input.close();
           }
}
