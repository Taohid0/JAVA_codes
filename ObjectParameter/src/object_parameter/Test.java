package object_parameter;

public class Test {
            int a,b;
            
            Test(int i,int j)
            {
            	a = i;
            	b = j;
            	
            }
            boolean equals (Test object)
            {
            	if(object.a == a)
            		return true;
            	return false;
            }
}
