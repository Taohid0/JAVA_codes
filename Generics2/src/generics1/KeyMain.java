package generics1;

public class KeyMain {
          public static void main(String args[]){
        	  
        	  Keyimplmnt<Integer,String>ob = new Keyimplmnt<Integer,String>(10,"ten");
        	  Keyimplmnt <String,String>ob2 = new Keyimplmnt <>("ten","hundred");
        	  
        	  System.out.println(ob.getValue());
        	  System.out.println(ob.getKey());
        	  System.out.println(ob2.getKey());
        	  System.out.println(ob2.getValue());
          }
}
