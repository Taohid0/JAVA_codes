package generics;

public class TwoGenmain {
                public static void main(String args[]){
                	
                	TwoGen<Integer,String>tg =new TwoGen<Integer,String> (100,"one hundred");
                	
                	tg.showType();
                	
                	int v1 =tg.getOb1();
                	String v2 = tg.getOb2();
                	
                	System.out.println(v1);
                	System.out.println(v2);
                	
                }
}
