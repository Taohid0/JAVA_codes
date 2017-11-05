package over;
public class OverDemo {
             private double length;
             private double height;
             private double width;
             

             OverDemo (Double l,double h,double w){
            	 height = h;
            	 width = w;
            	 length = l;
             }
             OverDemo(){
            	 height=-1;
            	 width = -1;
            	 length =-1;
             }
             OverDemo(Double len){
            	 height = width = length = len;
             }
             double volume(){
            	 return height*length*width;
             }
             
}
