package collection;

import java.util.HashMap;

public class map {
	public static void main(String[] args) {
		HashMap map =new HashMap();
		map.put("사과", "apple");
		map.put("메론", "melon");
		map.put("물", "water");
		
		System.out.println(map);
		System.out.println(map.get("사과"));
		map.remove("물");
		System.out.println(map);
		map.replace("메론", "melons");
		System.out.println(map);
		
	}
}
