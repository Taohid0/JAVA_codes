package genrics;
import java.io.*;
import java.util.*;

public class TryingMyself {
                  static Scanner s =  new Scanner(System.in);
                  
                  public static void main(String args[]){
                	  
                	  
                	  try {
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("g:/data/own.txt")));
				        bw.write(s.nextLine());
						bw.close();
				        
                	  } catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                	  
                	  try{
                		  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("g:/data/own.txt")));
                		  System.out.println(br.readLine());
                		  
                	  }
                	  catch(IOException e){
                		  
                	  }
                  }
}