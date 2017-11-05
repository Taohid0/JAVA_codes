package genrics;
import java.util.*;
import java.io.*;

public class File2 {
	
	      static Scanner s = new Scanner(System.in);
           
	      public static void main(String args[]){
        	    
        	     
        	    try {
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("G:/data/file1.txt")));
					
					bw.write(s.nextLine());
					bw.close();
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
        	  
        	    try{
        	    	BufferedReader br  = new BufferedReader(new InputStreamReader(new FileInputStream("G:/data/file1.txt")));
        	    	System.out.println(br.readLine());
        	    	
        	    }
        	    catch(FileNotFoundException e){
        	    	
        	    }
        	    catch(IOException e){
        	    	
        	    }
        	  
          }
}
