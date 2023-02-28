package basic;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class pract {

	public static void main(String[] args) {
//		1번문제.
// ------------------------------------------------
//		System.out.println("암호를 대시오");
//		Scanner passw = new Scanner(System.in);
//		String password = passw.next();
//		
//		if (password.equals("pass")) {
//			System.out.println("들어오세요");
//		} else {
//			System.out.println("나가시오");
//		}
//		
//
//		2번문제.
// ------------------------------------------------
//		String a = JOptionPane.showInputDialog("당신이 먹고싶은 저녁메뉴? 자장면, 라면, 회 등 입력");
//		if (a.equals("자장면")) {
//			System.out.println("중국집으로 가요!");
//		} else if(a.equals("라면")) {
//			System.out.println("분식집으로 가요");
//		} else if(a.equals("회")) {
//			System.out.println("횟집으로 가요");
//		} else {
//			System.out.println("그냥 안먹어요");
//		}
		
		
//		3번문제.
// ------------------------------------------------
		String n1 = JOptionPane.showInputDialog("정수1 입력");
		String n2 = JOptionPane.showInputDialog("정수2 입력");
		
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		
		int bignum;
		
		if (num1 > num2) {
			bignum = num1;
		} else if (num1 < num2) {
			bignum = num2;
		} else {
			bignum = -1;
		}
		
		JOptionPane.showMessageDialog(null, bignum);
		
		
		
//		4번문제.
// ------------------------------------------------
		
		String no = "A100EX";
		char n = no.charAt(0);
		
		switch(n) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default :
			System.out.println("해당부서 없음");
		}
		
		
	}

}
