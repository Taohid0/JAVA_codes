package object_parameter;

public class ObjectMain2 {
                public static void main (String args[])
                {
                	Box b1 = new Box(10,10,10);
                	Box b2=  new Box (b1);
                	
               
                	System.out.println("volume of box1 is " +b1.coumpute_volume() );
                	System.out.println("volume of box2 is " + b2.coumpute_volume());
                }
}
