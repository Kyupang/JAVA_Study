package JavaDB_Connection;

import java.util.Scanner;

public class 회원정보수정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberDAO dao = new MemberDAO();
		
		System.out.println("수정할 번호와, 아이디를 입력하세요");
		String tel = sc.next();
		String id = sc.next();
		dao.update(tel, id);
	}

}
