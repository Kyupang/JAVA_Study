package JavaDB_Connection;

import java.util.Scanner;

public class 회원탈퇴 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberDAO dao = new MemberDAO();
		
		System.out.println("탈퇴할 아이디를 입력하세요.");
		String id =  sc.next();
		dao.delete(id);
	}

}
