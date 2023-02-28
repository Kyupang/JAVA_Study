package study0209;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		Random r = new Random(); //seed value 
		//수도 랜덤 값 만드는 객체 
		System.out.print("로또 번호는? : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(r.nextInt(25)+",");
		}
		System.out.println(r.nextInt(25));
	}

}
