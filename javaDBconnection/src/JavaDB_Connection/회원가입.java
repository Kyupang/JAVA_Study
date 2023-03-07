package JavaDB_Connection;

import java.util.Scanner;

public class 회원가입 {

	public static void main(String[] args) {
		//일단 클래스로 DAO를 만들어서 처리를 했다.
		// insert와 delete를 우선적으로 만들어보았고
		//입력을 받으면 insert로 넘기도록 스캐너를 사용하였다
		Scanner sc = new Scanner(System.in);
		System.out.println("id/pw/name/tel 순으로 입력하세요.");
		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		String tel = sc.next();
		
		MemberDAO dao = new MemberDAO();
		dao.insert(id,pw,name,tel);
		
		
		
		
		String tel2 = sc.next();
		String id3 = sc.next();
		dao.update(tel2, id3);
		
	}
}
