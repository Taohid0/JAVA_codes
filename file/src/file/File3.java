package file;
import java.io.*;

public class File3 {
            public static void main(String args[]){
            	// FileOutputStream f;
				try {
				     FileWriter	f = new FileWriter("G:/data/test.txt");
					f.write("adadadad");
					f.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	 
				try {
					FileReader r = new FileReader("G:/data/test.txt");
				
					System.out.println(r.read());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
            	 
            }
}
