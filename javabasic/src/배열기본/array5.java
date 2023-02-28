package 배열기본;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class array5 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		JButton[] buttons = new JButton[500];
		
		for (int i= 0; i<buttons.length; i++){
			buttons[i]= new JButton("나는 버튼"+i);
		}
		f.setLayout(null); //위치 자동으로 잡아주는 부품 안씀 
		
		Random r = new Random();
		Color[] Color_ = {Color.red,Color.blue,Color.white,Color.green};
		
		
		for (int i= 0; i<buttons.length; i++){
			Color color=Color_[r.nextInt(4)];
			buttons[i].setBackground(color);
			buttons[i].setBounds(r.nextInt(500), r.nextInt(600),150,50);
			f.add(buttons[i]);
		}
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
