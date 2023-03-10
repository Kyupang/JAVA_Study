package collection;

import java.util.ArrayList;

public class Arrayliststudy {
	//많은 양의 데이터를 다루는 부품류를 콜렉션 이라고 한다.
	//==>종류가 많다.
	//==>많은 양의 데이터들도 특징이 있고, 그 특징에 따라
	//	콜렉션의 종류가 많음.
	//==> 배열 + 사이즈조절 + 타입 아무거나 넣을 수 있는 ArrayList
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove(1);
		//파괴함수 : 원본은 파괴시켜버리는 함수(원본이 변형, ram에 있는 데이터 변경)
		//비파괴함수 : 원본은 파괴되지않는 함수 (ram에 있는 데이터 불변)
		System.out.println(list);
		
		list.add(1, "냠냠");
		
		System.out.println(list);
		list.set(0, "정길동"); //파괴함수(o)
		System.out.println(list);
		System.out.println(list.indexOf(true));
		
		//포함여부 확인
		boolean result = list.contains("냠냠");
		System.out.println(result);
		
	}
	
	
}
