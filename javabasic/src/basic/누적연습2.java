package basic;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		int total = 0;
		for (int i=5;i<300;i++) {
			if(i%5 == 0) {
				total+=i;
				System.out.println(i);
			}
		}
		System.out.println(total);
		
		

		String sum2 = ""; //String의 초기값은 ""
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("머먹을래?");
			sum2 = sum2 + data + " ";
		}
		System.out.println(sum2);
	
		
	}

}
