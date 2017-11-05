package file_practice;
import java.io.*;

public class Buffer {
             private static final String EOF = null;

			public static void main(String args[]) {
            	 String s;
            	try{
            		BufferedReader br = new BufferedReader (new InputStreamReader (new FileInputStream("G:/data/fileown.txt")));
            	while(true){
            	    s = br.readLine();
            	if(s==EOF)break;
            	System.out.println(s);
            	 }
            	br.close();
            	}
            	catch(IOException e){
            		System.out.println("file not found");
            	}
            	
}}
