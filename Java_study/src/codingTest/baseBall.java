package codingTest;

import java.util.Scanner;

public class baseBall {
	
	static boolean checkNum(int nums[], int index) {
		for(int i =0; i<nums.length; i++) {
			//처음에 만들어진 수가 배열에 들어가는데 다음에 만든 
			//난수가 지금 들어가 있는 배열의 인덱스와 같으면 return true
			//안에 있는 수는 다 확인을 해봐야하기 때문에 for문으로 돌린다. 
			if(nums[i] == index) {
				return true;
			}
		}
				return false;
		
	}
	
	static int strike(String resultNum, String tryNum, int countStrike) {
		
		
		for(int i =0; i<resultNum.length();i++) {
			
			if(resultNum.charAt(i) == tryNum.charAt(i)) {
				countStrike +=1;
			}
		}
		return countStrike;
	}
	
	static int ball(String resultNum, String tryNum, int countBall) {
		String strBallCnt = "";
		int intBallCnt = 0;
		
		for (int i=0; i<resultNum.length();i++) {
			//tryNum에 있는 글자 하나하나를 데리고와서 resultNum에 있는 인덱스
			//인지 확인합니다. 그리고 
			if (resultNum.indexOf(tryNum.charAt(i))>=0 && resultNum.charAt(i)!=tryNum.charAt(i)) {
				strBallCnt +=Integer.toString(i);
				intBallCnt = strBallCnt.length();
				countBall = intBallCnt;
			}
		}
		return countBall;
	}
	
	
	
	public static void main(String[] args) {
		int nums[] = new int[3];
		int letter = nums.length;
		int index = 0;
		int countStrike = 0;
		int countBall = 0;
		String secretNum = "";
		String resultNum = "";
		String tryNum = "";
		
		for(int i=0; i<letter; i++) {
			do {
				// 먼저 while 조건에 상관없이 랜덤한 난수를 1에서 9까지 만들어준다.
				index = (int)(Math.random()*10);
			}while (checkNum(nums,index));
			// 그리고는 while 문에서 nums와 index를 가지고 중복이 있는지 확인한다.
			// true가 나오면 새로운 난수를 생성하고 
			// false가 나오면 다음 자리로 넘어간다.
			nums[i] = index;
		}
		
		//int형 배열 데이터를 String으로 형변환하여 n자리 난수생성.
		//난수를 생성하고 그들을 스트링으로 변환해서 스트링끼리 비교를 하겠다. 
		//각 자리수의 다름을 비교해야할 때는 string이 편하기 때문.
		for(int i=0; i<letter; i++) {
			//integer하나하나를 스트링으로 변환해서 resultNum에 추가.
			secretNum = Integer.toString(nums[i]);
			resultNum += secretNum;	
		}
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print(letter + "자리 숫자를 입력하세요: ");
			tryNum = sc.next();
			
			int bcnt = ball(resultNum, tryNum, countBall);
			int scnt = strike(resultNum, tryNum, countStrike);
			
			if(tryNum.equals(resultNum)) {
				System.out.println(letter+"스트라이크!");
				System.out.println(resultNum + ", 정답입니다.");
				System.out.println("게임종료");
				break;
			} else if(bcnt>0 && scnt>0) {
				System.out.println(scnt+ "스트라이크 "+ bcnt + "볼");
			} else if(bcnt>0) {
				System.out.println(bcnt+ "볼");
			} else if(scnt>0) {
				System.out.println(scnt+ "스트라이크");
			} else {
				System.out.println("낫싱");
			}
		}
		
		
	}
	
	

}
