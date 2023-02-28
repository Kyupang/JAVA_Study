package basic;

import java.util.Date;
import java.util.Scanner;

public class switchif3 {

	public static void main(String[] args) {
		Date date = new Date();
		int year =date.getYear()+1900;
		System.out.println("아 태어난 년도를 입력하시오~");
		Scanner birth = new Scanner(System.in);
		int birthday = birth.nextInt();		
			if (birthday < year) {
			System.out.println("말 할 줄 아시는군요?!");
		} else {
			System.out.println("갓난애기시군요~?");
		}
	}

}
