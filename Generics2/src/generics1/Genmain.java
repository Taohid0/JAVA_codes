package generics1;

public class Genmain {
        public static void main(String args[]){
        	
        	Gen<Integer>iob = new Gen<Integer>(10);
        	
        	System.out.println(iob.getOb());
        	int v = iob.getOb();
        	System.out.println(v);
        	
        	iob.showType();
        	
        	Gen<String>sob = new Gen<String>("String type");
        	
        	String s = sob.getOb();
        	System.out.println(s);
        	sob.showType();
        	
        }
}
