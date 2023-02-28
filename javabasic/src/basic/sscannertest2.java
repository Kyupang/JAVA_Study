package basic;

import java.util.Scanner;

public class sscannertest2 {

	public static void main(String[] args) {
		int startNum, endNum, result = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			startNum = sc.nextInt(); 
		} while(startNum <= 0);//0보다 작거나 같으면 다시입력
		
		do {
			endNum = sc.nextInt(); 
		} while(endNum < startNum);
		
		if (endNum == startNum) {
			System.out.println(0);
			System.exit(0);
		}
		sc.close();
		
		for(int i=startNum; i<=endNum; i++) { 
			result += i;
		}
		
		System.out.println(result);
		
	}
		

}
