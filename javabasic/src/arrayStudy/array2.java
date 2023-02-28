package arrayStudy;

public class array2 {

	public static void main(String[] args) {
		int [][] arr = new int[3][4];
		int [][] arr2 = new int[][] {{1,2,3,},{5,6,1,2}};
		
		for (int i =0 ; i< arr.length; i++) {
			for (int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}

}
