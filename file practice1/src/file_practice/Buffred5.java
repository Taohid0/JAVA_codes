package file_practice;
import java.util.*;
import java.io.*;

public class Buffred5 {
             static Scanner s = new Scanner (System.in);
             
             public static void main(String args[]){
            	 BufferedReader br = null;
            	 
            	 try{
            		 br = new BufferedReader (new InputStreamReader (new FileInputStream("G:/data/writer1.txt")));

            		 while(true){
            			 String s = br.readLine();
            			 if(s==null)break;
            			 System.out.println(s);
            		 }
            	 }
            	 catch(IOException e){
            		 System.out.println("file cannot found");
            	 }
            	 System.out.println("normally closed file");
            	 
            	 try {
					br.close();
				} catch (IOException e) {
			
					e.printStackTrace();
				}
             }
}