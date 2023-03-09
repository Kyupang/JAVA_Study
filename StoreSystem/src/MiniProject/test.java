package MiniProject;

import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		//일단 클래스로 DAO를 만들어서 처리를 했다.
		// insert와 delete를 우선적으로 만들어보았고
		//입력을 받으면 insert로 넘기도록 스캐너를 사용하였다
		Scanner sc = new Scanner(System.in);
//		System.out.println("name/cost/int stock/sort");
		
		
//		String name = sc.next();
//		String cost = sc.next();
//		int stock  = sc.nextInt();
//		String sort = sc.next();
		
		MP_ProductVO bag = new MP_ProductVO();
//		bag.setCost(cost);
//		bag.setName("안녕");
//		bag.setSort(sort);
//		bag.setCode(5);
//		bag.setStock(2);
		
		MP_ProductDAO dao = new MP_ProductDAO();
		dao.select_one("안녕");
	}

}
