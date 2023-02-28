package 배열기본;

import java.util.Scanner;

public class array6 {

	public static void main(String[] args) {
		String s = "google matjib";
		String s2 = "진짜!!";
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(1));
		System.out.println(s.endsWith("야"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(0, 2));
		System.out.println(s.lastIndexOf("프"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.replace("mat", "MaT"));//비파괴함수 
		System.out.println(s);
		String s3 = "감자,고구마,양파";
		String[] s4 = s3.split(",");
		for (String x: s4) {
			System.out.println(x);
		}
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String text = sc.nextLine();
		String trimed =  text.trim();
		System.out.println(trimed);
		
	}

}
