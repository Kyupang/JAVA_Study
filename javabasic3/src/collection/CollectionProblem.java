package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionProblem {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("여행지1");
		set.add("여행지1");
		set.add("여행지2");
		set.add("여행지5");
		set.add("여행지4");
		set.add("여행지4");
		set.add("여행지4");
		
		System.out.println(set);
		
		
		HashMap map = new HashMap();
		map.put("안방","TV");
		System.out.println(map.get("안방"));
		
		
		LinkedList list = new LinkedList();
		list.add("일2");
		list.add("일1");
		list.add("일3");
		list.add("일5");
		list.add("일4");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.remove());
		
	}

}
