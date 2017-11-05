package generics;

public class GenDemo2 {
            public static void main(String args[]){
            	
            	Gen<Integer>iOb;
            	
            	iOb = new Gen<Integer>(100);
            	
            	int v = iOb.getOb();
            	
            	iOb.showType();
            	
            	System.out.println(v);
            	
            	Gen<String>sOb = new Gen<String>("String 2");
            	
            	String s = sOb.getOb();
            	
            	sOb.showType();
            	System.out.println(s);
            	
            	
            	
            	
            }
}
