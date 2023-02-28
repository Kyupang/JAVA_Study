package collection;

import java.util.LinkedList;

public class queue {
	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("덜 싱싱한 우유");
		milk.add("싱싱한우유");
		
		System.out.println(milk);
		
		milk.remove();
		
		System.out.println(milk);
	}
}
