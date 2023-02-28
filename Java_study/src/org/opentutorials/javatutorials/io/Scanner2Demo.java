package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			//hasnextint는 1.메소드를 자바가 실행시키면 일단 정지한다.
			//2.중지되었던 자바의 실행을 다시 실행시킴 
			// 만약 입력한 값이 int라면 true 리턴
			// 즉 다른 문자 입력하면 프로그램이 종료된다. 
			System.out.println(sc.nextInt()*10000);
		}
		sc.close();
	}

}
