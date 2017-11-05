package genrics;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		TempleteClass<Shape> shpTemp = new TempleteClass<Shape>();
		Circle c = new Circle("red", 2);
		Rectangle r = new Rectangle("Blue", 5, 4);
		Square s = new Square("Yellow", 5);
		
		c.getArea(5);
		shpTemp.set(c);
		Shape areaCircle = shpTemp.get();
		System.out.println(areaCircle.toString());
		
		r.getArea(5,4);
		shpTemp.set(r);
		Object areaRec = shpTemp.get();
		System.out.println(areaRec.toString());
		
		s.getArea(5);
		shpTemp.set(s);
		Object areaSq = shpTemp.get();
		System.out.println(areaSq.toString());
		
		
		System.out.println("\n");
		
		ArrayList<Shape> array = new ArrayList<Shape>();
		array.add(c);
		array.add(r);
		array.add(s);
		
		Iterator<Shape> itr=array.iterator();
		
		while (itr.hasNext()) {
			Object element =  itr.next();
			System.out.println(element);

	}

}
}

