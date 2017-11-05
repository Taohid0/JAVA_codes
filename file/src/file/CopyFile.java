package file;

import java.io.*;

public class CopyFile {
   public static void main(String args[])
   {
   
      try {
         FileInputStream in = new FileInputStream("G:\\data\\input.txt");
         FileOutputStream out = new FileOutputStream("G:\\data\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }
      catch(IOException e){
	
}}}