package sayed;
import java.io.*;
import java.util.*;


public class Sayed {
              
	  
       public static void main (String [] args)
       {
    	   int[] arr   = new int[100];
    	   
           Random r = new Random();

      try{
    	
    	 FileWriter out = new FileWriter("E:/infile.txt");
    	
    	  
    	 for(int i =0;i<20;i++)
    	 {
    		 int x;
    		x = r.nextInt(100);
    		 
    		 out.write(x + " ");
    		
    	 }
    	 
    	  out.close();
    	  
      }
      
      catch (IOException e)
      {
    	  System.out.println("here is an exception in first file");
      }
      
      
      
      try
      {
    	  Scanner scanner = new Scanner(new File("E:/infile.txt"));
    	
    	  int index = 0;
    	  
    	  while(scanner.hasNext())
    	 {
    		  arr[index] = scanner.nextInt();
    		  index++;
    	 }
    	  
    	
    	  scanner.close();
      }
      
      catch (IOException e)
      {
    	  
      }
      
      for(int i =0;i<19;i++)
      {
    	  for(int j = i+1;j<20;j++)
    	  {
    		  if(arr[i]>arr[j])
    		  {
    			  
    			  int temp = arr[i];
    			  arr[i] = arr[j];
    			  arr[j] = temp;
    		  }
    	  }
      }
      
      try
      {
    	  Writer result = new FileWriter("E:/result.txt");
    	  
    	  for(int i =0;i<20;i++)
     	 {
     		
    		  result.write(arr[i] + " ");
              
     		
     	 }
      	result.close();
      }
      catch(IOException e)
      {
    	System.out.println("here is an exception in result file");  
      }
}
}