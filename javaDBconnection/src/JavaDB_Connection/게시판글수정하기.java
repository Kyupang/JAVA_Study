package JavaDB_Connection;

import java.util.Scanner;

public class 게시판글수정하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BbsDAO dao = new BbsDAO();
		
		System.out.println("수정 내용과 no를 입력하세요");
		String content = sc.next();
		String no = sc.next();
		dao.update(content, no);
	}

}
