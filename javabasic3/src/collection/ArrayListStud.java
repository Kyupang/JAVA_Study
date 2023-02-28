package collection;

import java.util.ArrayList;

public class ArrayListStud {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.clear();
		System.out.println(list.isEmpty());
	}
}
