package file_practice;
import java.io.*;
import java.util.*;

public class OwnFile2 {
	                   static Scanner inpt  = new Scanner (System.in);
	                   
             public static void main(String args[]){
            	   BufferedWriter bw = null;
            	   
            	   try{
            		   bw = new BufferedWriter (new OutputStreamWriter (new FileOutputStream("G:/data/ownfile1.txt")));
            	   }
            	   catch(IOException e){
            		   System.out.println("file cannot be created ");
            	   }
            	  
            	   try{
            		   while(true){
            		   String s = inpt.nextLine();
            		   if(s.equals("ok"))break;
            		   bw.write(s);
            		   bw.newLine();   
            	   }	   
            	   }
            	   catch(IOException e){
            		   System.out.println("exception found");
            	   }
            	   try{
            		   bw.close();
            	   }
            	   catch(IOException e){
            		   System.out.println("exception on closing file");
            	   }
             }
}