package generics1;

public class GenInMain {
       public static void main(String args[]){
    	   
    	   GenIn<Integer>iob = new GenIn<Integer>(10);
    	   GenIn2<Integer,String>iob2  = new GenIn2<Integer,String>(100,"hundred");
    	   
    	   System.out.println(iob.getOb1());
    	   System.out.println(iob2.getOb1());
    	   System.out.println(iob2.getob2());
       }
}
