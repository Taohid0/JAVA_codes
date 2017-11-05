package generics1;
import java.util.*;

public class ArrayL {
            public static void main(String args[]){
            	
            	ArrayList<Integer>a = new ArrayList<>();
            	a.add(10);
            	a.add(11);
            	a.add(12);
            	
            	Iterator it = a.iterator();
            	
                 while(it.hasNext()){
                	 System.out.println(it.next());
                 }
            }
}
