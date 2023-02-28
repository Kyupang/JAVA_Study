package 배열기본;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayStudy {

	public static void main(String[] args) {
		Random r = new Random();
		int[] score = new int[10000];
		int count = 0;
		int sum = 0;
		
		
		for (int i = 0; i<score.length;i++) {
			score[i] = r.nextInt(451);
			if(score[i]==450) {
				System.out.println("만점자는"+ i + "번째 학생입니다.");
			}else if(score[i]==0) {
				count++;
			}
			sum += score[i];
		}
		double mean = (double)sum/score.length;
		System.out.println("0점자는 " + count + "명 입니다.");
		System.out.println("평균은" + mean + "점 입니다.");
		
		int count1 =0;
		
		for (int x : score) {
			if ((mean-50)<= x && x <= (mean+50)) {
				count1++;
			}
		}
		System.out.println("평균 언저리에 있는 사람의 수는"+ count1+"입니다.");
		
		int count2 =0;
		int sum2=0;
		Arrays.sort(score);
		Integer []tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp, Collections.reverseOrder());
		System.out.println(tmp[2999]);
		
		for (int i = 0; i<tmp.length; i++) {
			if(tmp[i] >= tmp[2999]) {
				count2++;
				sum2 += tmp[i];
			}
		}
		int mean2 = sum2/count2;
		System.out.println("상위 30퍼센트의 인원수는"+count2+" 평균은 " + mean2 + "점입니다");
		
		
		
	}

}
