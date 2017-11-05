package generics1;

public class NonGenExMain {
                   public static void main(String args[]){
                	   
                	   NonGen  n = new NonGen(10);
                	   
                	   NonGenEx<String>n1 = new NonGenEx<String>("nongen ten",10);
                	   
                	  System.out.println( n.getob1());
                	   
                	  System.out.println( n1.getob1());
                	   System.out.println(n1.getob2());
                	   
                   }
}
