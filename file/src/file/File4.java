package file;
import java.io.*;

public class File4 {
        public static void main(String args[]){
        	
        	try{
        		 OutputStreamWriter r = new OutputStreamWriter(new FileOutputStream("G:/data/test3.txt"));
        		 r.write("adasdasda");
        		 r.close();
        	}
        	catch(IOException e){
        		
        	}
        	try{
        		BufferedReader bw = new BufferedReader(new InputStreamReader(new FileInputStream("G:/data/test.txt")));
        	    System.out.println(bw.readLine());
        	
        	}
catch(IOException e){
        		
        	}
        }
        	
        	
        }

