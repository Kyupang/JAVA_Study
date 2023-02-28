package arrayStudy;

import java.util.Random;

public class array4 {

	public static void main(String[] args) {
		int []arr = new int[999];
		int count = 0;
		Random r = new Random();
		for (int i=0; i<arr.length;i++) {
			arr[i]= r.nextInt(19)+2;
			if (arr[i]>3) {
				count++;
			}
		}
		
		for(int x: arr) {
			System.out.println(x);
		}
		System.out.println("-----------");
		System.out.println(count);
	}

}
