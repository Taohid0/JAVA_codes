package file_practice;
import java.util.*;
import java.io.*;

public class Buffred4 {
                  static Scanner inpt  = new Scanner(System.in);
              public static void main(String args[]){
            	  BufferedWriter br = null;
            	  
            	  try{
            		  br = new BufferedWriter (new OutputStreamWriter (new FileOutputStream("G:/data/write.txt")));
            		  while(true){
            			  String in = inpt.nextLine(); 
            			  if(in.equals("stop"))break;
            			  br.write(in);
            			  br.newLine();
            			 
            		  }
            	  }
            	  catch(IOException e){
            		  System.out.println("file not found");
            	  }
            	  try {
					  br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
              }
}