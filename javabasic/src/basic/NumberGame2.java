package basic;

import java.util.Random;
import java.util.Scanner;

public class NumberGame2 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		int data = 0;
		int target =0;
		while(true) {
			target = r.nextInt(10);
			data = scanner.nextInt();
			if (data == target) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("오답입니다.");
				if(data > target) {
					System.out.println("너무 커요!");
				} else {
					System.out.println("작거나 같아요!");
				}
				continue;
			} 
		}
		scanner.close();
	}

}
