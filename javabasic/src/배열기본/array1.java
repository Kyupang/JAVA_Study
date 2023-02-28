package 배열기본;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		String[] arr = new String[3];
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i< arr.length ; i++) {
			arr[i] = scanner.next();
		}
		
		for(String x : arr) {
			System.out.print(x+ " ");
		}
	}

}
