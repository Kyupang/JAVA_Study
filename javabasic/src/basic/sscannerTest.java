package basic;

import java.util.Scanner;

public class sscannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//컴퓨터의 키보드로 입력 받겠다.
		//자바 프로그램과 콘솔간에 통로를 만든다. 
		//연결통로 == Stream
		//Stream은 닫아주지 않으면 계속 자원을 사용하니 꺼줘야함.
//		System.out.print("요일 입력: 주중1) 주말2)");
//		int data = scanner.nextInt(); // String --> int //안쓰면 그냥 string 
//		if (data ==1) {
//			System.out.println("열심히 달리자.");
//		}else {
//			System.out.println("푹 쉬자~");
//		}
//		
//		System.out.print("주말에 뭐할까?");
//		String data2 = scanner.next(); //단어
//		System.out.println("나는 주말에"+data2+"를 할거야.");
//		
		
		
		int data2 = scanner.nextInt();
		scanner.nextLine();
		String data4 = scanner.nextLine();
		System.out.println(data4);
		
		scanner.close(); //가비지 콜렉터가 잡아주지 않음. 
		
		
	}

}
