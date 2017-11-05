package box;

class box
{
	double height;
	double length;
	double width;
	
	double volume()
	{
		return height*width*length;
	}
}

public class BoxThree {
  public static void main (String args[])
  {
	  box mybox = new box();
	  
	  mybox.height = 10;
	  mybox.length = 10;
	  mybox.width = 10;
	  
	  System.out.println(mybox.volume());
	  
  }
}
