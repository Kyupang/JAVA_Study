package ClassApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login {
	public static void main(String[] args) {
		// jFrame, imageicon, imagelabel.
		// font, flow
		// idlabel, pwlabel, id입력값, pw입력값,
		// 로그인 버튼, reset 버튼

		JFrame f = new JFrame();
		f.setTitle("내 일기장 로그인");
		f.setSize(500, 600);
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("D2coding", 1, 30);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아 이  디 : ");
		JLabel pw = new JLabel("패스워드 : ");
		id.setFont(font);
		pw.setFont(font);

		ImageIcon icon1 = new ImageIcon("20230214-153407-001.png");
		ImageIcon icon2 = new ImageIcon("20230214-153851-001.png");
		ImageIcon icon3 = new ImageIcon("20230214-153857-001.png");
		top.setIcon(icon1);

		JTextField idText = new JTextField(10);
		JTextField pwText = new JTextField(10);
		idText.setFont(font);
		pwText.setFont(font);

		JButton login = new JButton();
		JButton reset = new JButton();
		login.setIcon(icon2);
		reset.setIcon(icon3);

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				idText.setText("");
				pwText.setText("");
			}
		});

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id2 = idText.getText();
				String pw2 = pwText.getText();
				
				if(id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f,"로그인 성공!");
					Diary diary = new Diary();
					diary.open();
				}else {
					JOptionPane.showMessageDialog(f,"로그인 실패!");					
				}
			}
		});

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
