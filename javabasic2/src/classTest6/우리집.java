package classTest6;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순","여");
		딸 d2 = new 딸("홍길진","여");
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("딸은 "+딸.count+"명 입니다.");
		System.out.println("아빠 돈: "+딸.fatherWal+"원 남았습니다.");
	}

}
