package arrayStudy;

public class array6 {

	public static void main(String[] args) {
		int[] num3 = {100,200,300};
		int[] num4 = num3.clone();
		
		num4[2] = 3;
		for (int i = 0; i<num3.length; i++) {
			boolean a = (num3[i] == num4[i]);
			System.out.println(a);
		}
	}

}
