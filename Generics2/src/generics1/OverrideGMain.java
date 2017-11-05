package generics1;

public class OverrideGMain {
                  public static void main(String args[]){
                	  
                	  OverrideG<Integer>o1 = new OverrideG<Integer>(10);
                	  
                	  OverrideGen2 <String>o2 = new OverrideGen2<String>("ten");
                	  
                	  System.out.println(o1.getOb());
                	  System.out.println(o2.getOb());
                	  System.out.println(o2.getob2());
                  }
}
