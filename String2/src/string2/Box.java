package string2;

public class Box {
       double height,width,length;
       
       Box(double height,double width,double length){
    	   this.height = height;
    	   this.width  = width;
    	   this.length = length;
       }
       
       public String toString(){
    	        return "dimensions are : " + height +" by " + width+ " by " + length;
       }
} 
