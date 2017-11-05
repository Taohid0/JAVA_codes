package generics1;

public class Gen2Main {
         public static void main(String args[]){
        	 
        	 Gen2<Integer,String>obj = new Gen2<Integer,String>(10,"ten");
        	 
        	 obj.showType();
        	 System.out.println(obj.getOb1());
        	 System.out.println(obj.getOb2());
        	 
         }
}
