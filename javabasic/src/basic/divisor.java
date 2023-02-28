package basic;

import javax.swing.JOptionPane;

public class divisor {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("키를 입력하시오");
		String weight = JOptionPane.showInputDialog("몸무게를 입력하시오");
		
		double height2 = Double.parseDouble(height);
		double weight2 = Double.parseDouble(weight);
		
		double result = (height2 - weight2) * 0.9;
		
		System.out.println(result);
		
		JOptionPane.showMessageDialog(null, result);
		
		
	}

}
