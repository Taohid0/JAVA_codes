package file;
import java.io.*;
import java.util.*;

public class Today {
                     public static void main(String args[]){
                    	  Scanner s = new Scanner(System.in);
                    	 
                    	 try {
							BufferedReader br = new BufferedReader (new InputStreamReader(new FileInputStream ("G:/data/a.txt")));

                           System.out.println(br.readLine());
						 
                    	  br.close();
                    	 } catch (FileNotFoundException e) {
							System.out.println("file not found");
						 } 
                    	 catch (IOException e) {
							e.printStackTrace();
						}
                    	 
                 try {
					BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("G:/data/b.txt"))) ;
				
                    bw.write(s.nextLine());
                    bw.close();
                 
                 } catch (FileNotFoundException e) {
				
					e.printStackTrace();
				} catch (IOException e) {
				
					e.printStackTrace();
				}	
                    	 
                     }
}
