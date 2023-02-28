package arrayStudy;

public class array1 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[] {1,2,3,4};
		
		int total = 0;
		
		for (int i =0,num=1 ; i<array1.length; i++) {
			array1[i] = num++;
			System.out.println(array1[i]);	
			
		}
		for (int num : array1) {
			total +=num;
		}
		System.out.println(total);
		
		//배열안에 있는 요소들을 하나씩 돌면서 i에 저장 
		for (int i : array2) {
			System.out.println(i);
		}
	}

}
