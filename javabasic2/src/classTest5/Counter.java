package classTest5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);

		JLabel number = new JLabel("0");
		Font font = new Font("D2coding", Font.BOLD, 150);
		number.setFont(font);
		number.setForeground(Color.red);

		JButton b1 = new JButton("1 더하기");
		JButton b2 = new JButton("0으로 초기화");
		JButton b3 = new JButton("1 빼기");

		b1.setBackground(Color.green);
		b1.setForeground(Color.black);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		b3.setBackground(Color.green);
		b3.setForeground(Color.black);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");
			}
		});

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
