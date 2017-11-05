package box;
import java.util.Scanner;

public class MainBox {
             public static void main (String args[])
             {    double height,length,width;
             
            	 // ReBox1 myBox = new ReBox1();
                                	  
            	  Scanner scn = new Scanner(System.in);  
            	  
            	  System.out.println ("enter the height");
            	  height = scn.nextDouble();
            	  
            	  System.out.println("enter the width");
            	  width = scn.nextDouble();
            	  
            	  System.out.println("enter length");
            	  length = scn.nextDouble();
            	   
            	  ReBox1 myBox = new ReBox1(height,width,length);
            	  
            	  System.out.println("height " + height + " \nwidth " +width + " \nlength " + length+" \nvolume " + myBox.volume());
            	  
            	  
            	     scn.close(); 
             }
            
            	
             
}
