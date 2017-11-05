package lab;
import java.util.*;

public class ShapeMain {
	public static void main(String args[]){
		
	Templete<Shape> shpTemp = new Templete<Shape>();
	
	Circle c = new Circle("red", 2);
	Rectangle r = new Rectangle("Blue", 5, 4);
	Square s = new Square("Yellow", 5);
	
	c.getArea();
	shpTemp.setOb(c);
	Object areaCircle = shpTemp.getOb();
	System.out.println(areaCircle.toString());
	
	r.getArea();
	shpTemp.setOb(r);
	Object areaRec = shpTemp.getOb();
	System.out.println(areaRec.toString());
	
	s.getArea();
	shpTemp.setOb(s);
	Object areaSq = shpTemp.getOb();
	System.out.println(areaSq.toString());
	
	
	System.out.println("\n");
	
	ArrayList<Object> array = new ArrayList<Object>();
	array.add(c);
	array.add(r);
	array.add(s);
	
	Iterator<Object> itr=array.iterator();
	
	while (itr.hasNext()) {
		Object element =  itr.next();
		System.out.println(element);

}

}
}


