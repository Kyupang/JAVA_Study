package 배열기본;

import java.util.Random;

public class array3 {
	public static void main(String[] args) {
		int[] answer = new int [990];
		int[] myanswer = new int [990];
		
		Random r = new Random();
		for (int i = 0; i < answer.length ; i++) {
			answer[i] = r.nextInt(4)+1; 
			myanswer[i] = r.nextInt(4)+1;
		}
		
		System.out.println("번호\t:\t답안\t\t내 답");
		for(int i = 0; i < answer.length ; i++) {
			System.out.println(i+ "\t:\t" + answer[i] + "\t<->\t" +  myanswer[i]);
		}
		
		int score = 0;
		for(int i = 0; i < answer.length ; i++) {
			if(answer[i] == myanswer[i]) {
				score ++;
			}
		}
		System.out.println(score);
	}
}
