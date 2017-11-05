package box;

	class box
	{
		double length;
		double height;
		double width;
	}
	

public class BoxOne {
                 public static void main (String args[])
                 {
                	 box MyBox = new box ();
                	 double volume;
                	 
                	 MyBox.length = 10;
                	 MyBox.height = 10;
                	 MyBox.width = 10;
                 
                 volume = MyBox.length*MyBox.length*MyBox.width;
                 System.out.println(volume);
}
}
