package file_practice;
import java.io.*;

public class OwnFile1 {
             public static void main(String args[]){
            	 
            	 BufferedReader br = null;
            	 
            	 try{
            		 br = new BufferedReader (new InputStreamReader (new FileInputStream ("G:/data/ownfile1.txt")));
            	 }
            	 catch(IOException e){
            		 System.out.println("file cannot be created");
            	 }
            	 try{
            		 while(true){
            			 String s = br.readLine();
            			 if(s==null)break;
            			 System.out.println(s);
            		 }
            	 }
            	 catch(IOException e){
            		 System.out.println("exception found");
            	 }
            	 try{
            		 br.close();
            	 }
            	 catch(IOException e){
            		 System.out.println("exception on closing file");
            	 }
             }
} 
