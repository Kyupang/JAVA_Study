package collection;

import java.util.HashSet;
import java.util.Random;

public class SetStudy {

	public static void main(String[] args) {
		Random r = new Random(42);
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; i < 10; i++) {
			lotto.add(r.nextInt(10));
		}
		System.out.println(lotto);
	}
	

}
