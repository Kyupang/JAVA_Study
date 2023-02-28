package org.opentutorials.javatutorials.array;

public class DefineDemo {

	public static void main(String[] args) {
		String[] classGroup = {"최진혁", "최유빈", "한이람", "이고잉"};
	
		for(int i =0; i< classGroup.length; i++ ) {
			System.out.println(classGroup[i]);
		}
		
		 String[] members = { "최진혁", "최유빈", "한이람" };
	     for (String e : members) {
	        System.out.println(e + "이 상담을 받았습니다");
	     }   	
		
	}

}
