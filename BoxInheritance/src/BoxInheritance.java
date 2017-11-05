
class Box{
	     double height;
	     double width;
	     double length;
	     
	     Box(Box ob){
	    	 
	    	 height = ob.height;
	    	 width = ob.width;
	    	 length = ob.length;
	     }
	     
	     Box (double h,double w,double l){
	    	 width = w;
	    	 height = h;
	    	 length = l;
	     }
	     
	     Box(){
	    	 width = -1;
	    	 height = -1;
	    	 length = -1;
	     }
	     Box(double len){
	    	 width = height = length= len;
	     }
	     
	     double volume(){
	    	 return width*height*length;
	    	 }
}
class BoxWeight extends Box{
			double weight;
			
			BoxWeight(double w,double h,double l,double m){
				width = w;
				height = h;
				length = l;
				weight = m;
			}
}

public class BoxInheritance {
             public static void main(String args[]){
            	 BoxWeight mybox1 = new BoxWeight(10,11,12,13);
            	 BoxWeight mybox2 = new BoxWeight(20,21,22,23);
            	 
            	 double vol;
            	 
            	 vol = mybox1.volume();
            	 System.out.println("Volume of mybox1 is "+vol);
            	 System.out.println("weight of mybox1 is "+mybox1.weight);
            	 System.out.println();
            	 
            	 vol = mybox2.volume();
            	 System.out.println("volume of mybox2 is"+vol);
            	 System.out.println("weight of mybox2 is"+mybox2.weight);
             }
} 
