package crawling;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FinanceCrawling {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 400);
		f.getContentPane().setBackground(Color.green);
		f.setLayout(new FlowLayout());
		Font font = new Font("궁서", Font.BOLD, 40);
		JButton b1 = new JButton("삼 성 전 자");
		JButton b2 = new JButton("카   카   오");
		JButton b3 = new JButton("네   이   버");
		JButton b4 = new JButton("크롤링시작");
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		JLabel label = new JLabel("CODE");
		label.setFont(font);

		JTextField text = new JTextField(7);
		text.setFont(font);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 삼성전자 코드 005930 주면서 크롤링
				NavaerFinanceCrawling2 c = new NavaerFinanceCrawling2();
				c.Naver("005930");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 삼성전자 코드 005930 주면서 크롤링
				NavaerFinanceCrawling2 c = new NavaerFinanceCrawling2();
				c.Naver("263750");
				
//				//심화)) 파일에 저장(파일명: 005930.txt)
//				FileWriter file = new FileWriter(code2 + ".txt");
//				file.write(code2 + "\n");
//				file.write(today + "\n");
//				file.write(low + "\n");
//				file.write(high + "\n");
//				file.close();
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 삼성전자 코드 005930 주면서 크롤링
				NavaerFinanceCrawling2 c = new NavaerFinanceCrawling2();
				c.Naver("035720");
			}
		});
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 삼성전자 코드 005930 주면서 크롤링
				NavaerFinanceCrawling2 c = new NavaerFinanceCrawling2();
				c.Naver(text.getText());
			}
		});

		

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
