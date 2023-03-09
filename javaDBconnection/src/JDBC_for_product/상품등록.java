package JDBC_for_product;

import java.util.Scanner;

import JavaDB_Connection.MemberDAO2;

public class 상품등록 {

	public static void main(String[] args) {
		//일단 클래스로 DAO를 만들어서 처리를 했다.
		// insert와 delete를 우선적으로 만들어보았고
		//입력을 받으면 insert로 넘기도록 스캐너를 사용하였다
		Scanner sc = new Scanner(System.in);
		System.out.println("id/name/content 순으로 입력하세요.");
		String id = sc.next();
		String name = sc.next();
		String content = sc.next();
		
		ProductVO bag = new ProductVO();
		
		bag.setId(id);
		bag.setName(id);
		bag.setContent(id);
		
		ProductDAO dao = new ProductDAO();
	}
}
