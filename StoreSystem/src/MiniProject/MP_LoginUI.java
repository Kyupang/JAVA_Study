package MiniProject;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MP_LoginUI {

	public void open() {

		JFrame f = new JFrame();
		f.setSize(380, 300);

		// CREATE NEW // PANEL TABLE
		ImageIcon icon = new ImageIcon("Olive.png");
		JLabel l1 = new JLabel(icon);
		// JLabel l1 = new JLabel("<<네이버 회원가입화면>>");
		
		JLabel l2 = new JLabel("ID    ");
		JLabel l3 = new JLabel("PW  ");

		Font font1 = new Font("D2coding", Font.BOLD, 40);
		Font font2 = new Font("D2coding", Font.BOLD, 30);
		Font font3 = new Font("D2coding", Font.BOLD, 15);
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);

		JButton b1 = new JButton("회원 로그인");
		JButton b2 = new JButton("관리자 로그인");
		JButton b3 = new JButton("회원 가입");
		JButton b4 = new JButton("관리자 회원가입");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		l1.setFont(font1);
		l2.setFont(font2);
		l3.setFont(font2);
		
		t1.setFont(font2);
		t2.setFont(font2);

		b1.setFont(font3);
		b2.setFont(font3);
		b3.setFont(font3);
		b4.setFont(font3);

		t1.setBackground(Color.white);
		t2.setBackground(Color.white);

		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "로그인 하셨습니다.");
				MP_ProductUI ui = new MP_ProductUI();
				ui.open();
				f.dispose();
			}
		});
		
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

	
		
		f.setVisible(true);
	}

}
