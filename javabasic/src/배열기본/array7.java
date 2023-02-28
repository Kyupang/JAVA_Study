package 배열기본;

public class array7 {

	public static void main(String[] args) {
		int[][] s = {{1,2,3},{2,3,3,4},{5,6,7}};
		
		for (int i = 0; i< s.length; i++) {
			for (int j = 0; j<s[i].length; j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
	}
}
