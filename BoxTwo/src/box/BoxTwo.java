package box;

class box
{
	double length;
	double height;
	double width;
}

public class BoxTwo {
        public static void main (String args[])
        {
        	box mybox1 = new box();
        	box mybox2 = new box();
        	
        	mybox1.length = 10;
        	mybox1.height = 10;
        	mybox1.width = 10;
        	
        	mybox2.length = 10;
        	mybox2.height = 20;
        	mybox2.width = 30;
        	
        	double volume1 = mybox1.length*mybox1.width*mybox1.length;
        	double volume2 = mybox2.length*mybox2.width*mybox2.length;
        	
        	System.out.println(volume1+volume2);
        	
        }
}
