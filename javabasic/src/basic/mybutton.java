package basic;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.FloatBuffer;

import javax.swing.JButton;
import javax.swing.JFrame;

public class mybutton {
	public static void main(String[] args) {
		//Make frame
		JFrame f = new JFrame();
		//Set frame size 
		f.setSize(200, 230);
		
		f.getContentPane().setBackground(Color.pink);
		
		
		JButton b = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		Font font = new Font("D2Coding", 1, 20);
		
		b.setFont(font);
		b.setBackground(Color.blue);
		b.setText("별 10개");
		b2.setFont(font);
		b2.setBackground(Color.red);
		b2.setText("커피*5");
		b3.setFont(font);
		b3.setBackground(Color.blue);
		b3.setText("커피*우유*3");
		b4.setFont(font);
		b4.setBackground(Color.red);
		b4.setText("1.짱!");
		
		
		f.add(b);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		//1)버튼에다가 액션기능을 추가하겠다고 설정
		//2)클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게할지 코딩
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println();
				System.out.println("b1을 클릭했음!");
				for (int i =0; i<10 ; i++) {
					System.out.print("*");
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println();
				System.out.println("b2을 클릭했음!");
				for (int i =0; i<5 ; i++) {
					System.out.print("커피*");
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println();
				System.out.println("b3을 클릭했음!");
				for (int i =0; i<3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println();
				System.out.println("b4을 클릭했음!");
				for (int i=0; i<3; i++) {
					System.out.println((i+1)+".짱!");
				}
			}
		});
		
		
		f.setVisible(true);
	}
}
