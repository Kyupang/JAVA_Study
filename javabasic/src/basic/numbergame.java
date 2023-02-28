package basic;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class numbergame {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 500);
		
		f.getContentPane().setBackground(Color.pink);
		
		JLabel l = new JLabel(); 
		l.setText("당신이 생각한 숫자를 입력하시오");
		
		JTextField text = new JTextField(10);
		JButton b = new JButton();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding", 1, 20);
		Font font2 = new Font("D2Coding", 1, 30);
		
		
		l.setFont(font);
		l.setForeground(Color.red);
		
		text.setBackground(Color.pink);
		text.setForeground(Color.white);
		text.setFont(font2);
		
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		b.setFont(font2);
		b.setText("Number Game");
		
		f.setLayout(flow);
		
		f.add(l);
		f.add(text);
		f.add(b);
		
		
		f.setVisible(true);
	}

}
