package object_parameter;

public class Box {
            int height;
            int length;
            int width;
            
            Box (Box ob)
            {
            	height = ob.height;
            	length = ob.length;
            	width  = ob.width;
            	
            }
            
            Box (int h,int l,int w)
            {
            	height = h;
            	length  = l;
            	width  = w;
            }
            
            int coumpute_volume()
            {
            	return height*width*length;
            }
}
