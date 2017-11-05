
class Box{
	double width;
	double height;
	double length;
	
	Box(double w,double h,double l){
		width  = w;
		height = h;
		length = l;
	}
	Box(){
		width = -1;
		height = -1;
		length = -1;
	}
	Box (double len){
		width =height = len;
	}
	double volume(){
		return width*height*width;
	}
}

public class OverloadingConstructor {
            public static void main (String args[]){
            	Box mybox1 = new Box(10,20,20);
            	Box mybox2 = new Box (10);
            	Box mybox3 = new Box();
            	
            	double vol;
            	
            	vol = mybox1.volume();
            	System.out.println("volume of mybox 1 is " +vol);
            	
            	vol = mybox2.volume();
            	System.out.println("volume of mybox 2 is " + vol);
            	
            	vol = mybox3.volume();
            	System.out.println("volume of mybox 2 is " + vol);
            }
}
