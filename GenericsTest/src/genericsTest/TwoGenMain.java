package genericsTest;

public class TwoGenMain {
             public static void main(String args[]){
            	 
            	 TwoGen<Integer,String> t = new TwoGen<Integer,String>(10,"ten");
            	 
            	 System.out.println(t.getob1());
            	 System.out.println(t.getob2());
             }
}
