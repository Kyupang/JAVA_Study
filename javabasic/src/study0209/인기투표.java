package study0209;

import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 인기투표 {

	public static void main(String[] args) {

		// Make frame
		JFrame f = new JFrame();
		// Set frame size
		f.setSize(400, 730);

		f.getContentPane().setBackground(Color.pink);

		FlowLayout flow = new FlowLayout();

		// f에 물흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);

		JLabel textmain = new JLabel(); // 글씨
		textmain.setText("인기투표를 해봅시다~");

		JLabel text1_1 = new JLabel(); // 글씨
		text1_1.setText("1.아이유");
		JLabel text1_2 = new JLabel(); // 글씨

		JLabel text2_1 = new JLabel(); // 글씨
		text2_1.setText("2.뉴진스");
		JLabel text2_2 = new JLabel();

		JLabel text3_1 = new JLabel(); // 글씨
		text3_1.setText("3.김대영");
		JLabel text3_2 = new JLabel();

		ImageIcon icon = new ImageIcon("iu.jpg");
		ImageIcon icon2 = new ImageIcon("newjeans.jpg");
		ImageIcon icon3 = new ImageIcon("2.jpg");
		Image image1 = icon.getImage();
		Image changeImage = image1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon copyicon = new ImageIcon(changeImage);

		Image image2 = icon2.getImage();
		Image changeImage2 = image2.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon copyicon2 = new ImageIcon(changeImage2);

		Image image3 = icon3.getImage();
		Image changeImage3 = image3.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		ImageIcon copyicon3 = new ImageIcon(changeImage3);

		JButton b = new JButton();
		b.setIcon(copyicon);
		JButton b2 = new JButton();
		b2.setIcon(copyicon2);
		JButton b3 = new JButton();
		b3.setIcon(copyicon3);

		Font font1 = new Font("D2coding", 1, 30);
		Font font2 = new Font("D2coding", 1, 20);

		textmain.setFont(font1);
		text1_1.setFont(font2);
		text1_2.setFont(font2);
		text2_1.setFont(font2);
		text2_2.setFont(font2);
		text3_1.setFont(font2);
		text3_2.setFont(font2);

		f.add(textmain);
		f.add(b);
		f.add(text1_1);
		f.add(text1_2);
		f.add(b2);
		f.add(text2_1);
		f.add(text2_2);
		f.add(b3);
		f.add(text3_1);
		f.add(text3_2);

		int newjeans = 0;
		int bts = 0;

		b.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				text1_2.setText(i + "표");
			}
		});

		b2.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				text2_2.setText(i + "표");
			}
		});

		b3.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				text3_2.setText(i + "표");
			}
		});

		f.setVisible(true);

//		
//		System.out.println("인기 투표! 1)아이유 2)뉴진스 3)BTS 4)종료");
//		while(true) {
//			if(data == 1) {
//				iu++;
//			}else if (data == 2) {
//				newjeans++;
//			}else if (data == 3) {
//				bts++;
//			}else {
//				System.out.println("시스템을 종료합니다.");
//				break;
//			}
//			
//			
//		}
//		System.out.println("아이유"+iu+"표");
//		System.out.println("뉴진스"+newjeans+"표");
//		System.out.println("비티에스"+bts+"표");
//		
//		scanner.close();
//		

	}

}
