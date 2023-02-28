package 배열기본;

import java.util.Random;

public class array2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] n1 = new int[1000];
		int[] n2 = new int[1000];
		
		for(int i=0; i<n2.length; i++) {
			n1[i] = r.nextInt(101);
		}
		int count = 0;
		int count2 = 0;
		
		for (int i = 0; i< n2.length; i++) {
			System.out.println(n1[i]==n2[i]);
		}
	}

}
