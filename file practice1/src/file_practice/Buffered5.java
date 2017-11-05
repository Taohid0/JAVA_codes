package file_practice;
import java.util.*;
import java.io.*;

public class Buffered5 {
	                    
	     			   static Scanner s = new Scanner(System.in);
	     			   
         public static void main(String args[]){
        	     BufferedWriter bw = null;
        	     
        	     try{
        	    	 bw = new BufferedWriter (new OutputStreamWriter (new FileOutputStream("G:/data/writer1.txt")));
        	        
        	    	 while(true){
        	    		 String input = s.nextLine();
        	    	 
        	         if(input.equals("stop"))break;
        	           bw.write(input);
        	           bw.newLine();
        	     }}
        	     catch(IOException e){
        	    	 System.out.println("file cannot found");
        	     }
        	     try {
					bw.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
         }
}
