package casting;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1000); // Object <- Integer <- int
						// 오토 박싱
		list.add(189.1);
		list.add(false);
		list.add('남');
		
		
		//ArrayList 는 toString() 가 재정의 
		//list 라는 참조형이기 때문에 list를 프린트하면 주소!가 프린트
		System.out.println(list);
		int i = (Integer)list.get(0); // < 오토박싱과 언박싱이 자유로움 
		double d = (Double)list.get(1);
		boolean b = (boolean)list.get(2);
		
		System.out.println(i + 20000);
		if(b) {
			System.out.println("배고파요");
		} else {
			System.out.println("배안고파요");
		}
		
		byte c =100;
		int f = c; // 업캐스팅
		
		int i2 = 10;
		byte b2 = (byte)i2; //강제 다운캐스팅
		
		//캐스팅은 보통 부모클래스로 arraylist를 만든다음 
		//객체를 집어넣어놓고 
		//각각 조건에 맞으면 instanceof 를 사용해서 
		//다운캐스팅을 진행하고 각 메서드를 사용하는 방법이 기본적 
	}

}
