package amit_sir;
import java.util.*;

public class IteratorJava2 {
            public static void main(String args[]){
            	
            	ArrayList<String>a = new ArrayList<String>();
            	
               a.add("one");
               a.add("two");
               a.add("three");
               
               Iterator it = a.iterator();
               
               while(it.hasNext()){
            	   Object obj = it.next();
            	   System.out.println(obj);
               }
            	
            	
            }
}
