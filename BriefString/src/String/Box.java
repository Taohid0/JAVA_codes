package String;

public class Box {
            double height;
            double width;
            double length;
            
         Box(double w,double h,double l){
        	 height = h;
        	 width   = w;
        	 length =l;
         }
         
         public String toString(){
        	 return "Dimensions are " + width + " by " + height + " by " + length + ".";
         }
}
