package amit_sir;
import java.util.*;

public class TempleteMain {
                 public static void main(String args[]){
                	 
                	 TempleteClass<Rectangle>arraylist = new TempleteClass<Rectangle>(Rectangle.class,12);
                	 
                	 Rectangle r1  =new Rectangle ("red",12,21);
                	 Rectangle r2  =new Rectangle ("black",10,11);
                	 Rectangle r3  =new Rectangle ("red",120,21);
                	 Rectangle r4  =new Rectangle ("red",12,210);
                	 
                	 arraylist.add(r1);
                	 arraylist.add(r2);
                	 arraylist.add(r3);
                	 arraylist.add(r4);
                	 
                	 int i = arraylist.size;
                	 
                	 for(int j = 0;j<i;j++){
                		 Object obj = arraylist.get();
                		 System.out.println(obj);
                	 }
                 }
}
