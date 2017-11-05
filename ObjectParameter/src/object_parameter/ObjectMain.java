package object_parameter;

public class ObjectMain {
                public static void main (String args[])
                {
                	Test ob1 = new Test (20,30);
                	Test ob2 = new Test (20,30);
                	Test ob3 = new Test (5,10);
                	
                	
                	System.out.println("ob1==ob2 : " + ob1.equals(ob2));
                	System.out.println("ob2==ob3 : " + ob2.equals(ob3));
                }
}
