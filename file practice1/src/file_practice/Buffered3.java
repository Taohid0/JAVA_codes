package file_practice;
import java.io.*;
import java.util.*;

public class Buffered3 {
	          static Scanner s = new Scanner(System.in);
	          
            public static void main(String args[]){
            //	int inpt = s.nextInt();
            			
            	BufferedReader br;
            	try{
            		br = new BufferedReader (new InputStreamReader (new FileInputStream("G:/data/fileown.txt")));
            	   while(true){
            		String  inpt = br.readLine();
            		if(inpt==null)break;
            	    System.out.println(inpt);
            	}}
            	catch(IOException e){
            		System.out.println("file not found");
            	}
            	System.out.println("program ended normally");
            }
}
