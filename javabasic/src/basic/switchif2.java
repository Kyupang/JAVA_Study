package basic;

import java.util.Date;

public class switchif2 {

	public static void main(String[] args) {
		String ssn = "2055111";
		if (ssn.equals("2055111")) {
			System.out.println("동일한 지역에서 태어나셨군요!!");
		}else {
			System.out.println("동일한 지역에서 태어난게 아니군요!!");
		}
		
		char gender = ssn.charAt(0);
		switch(gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		}
		
		// Date - 년월일시분초, java.util.Date
		Date date = new Date();
		
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDay());
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		
		int second = date.getSeconds();
		if (second == 1) {
			System.out.println('1');
		}
		else if (second == 4) {
			System.out.println('4');
		}
		else if (second == 7) {
			System.out.println("7");
		}
		else if (second == 11) {
			System.out.println("11");
		}
		else if (second == 15) {
			System.out.println("15");
		}
		else if (second == 20) {
			System.out.println("20");
		}
		else if (second == 26) {
			System.out.println("26");
		}
		else {
			System.out.println("1010");
		}
		
	}

}
