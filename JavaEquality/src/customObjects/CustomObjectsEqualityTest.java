package customObjects;

import java.util.ArrayList;

public class CustomObjectsEqualityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Point p1 = new Point(10,10);
		Point p2 = new Point(20,20);
		Point p3 = new Point(10,10);
		Point p4 = new Point(20,20);
		
		ArrayList<Point> list = new ArrayList<>();
		ArrayList<Point> list2 = new ArrayList<>();
		
//		System.out.println(System.identityHashCode(list));
//		System.out.println(System.identityHashCode(list2));
		
		list.add(p1);
		list.add(p2);
		
		list2.add(p3);
		list2.add(p4);
		
		
		System.out.println(list==list2);
		System.out.println(list.equals(list2));
		
	}

}
