package MiniProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MP_ProductUI {
	public static JScrollPane scrollPane;

	public void open() {

		// ---------------------------------------------------------
		// list 가져와서 가방 하나하나 꺼내보기
		String header[] = { "CODE", "NAME", "COST", "STOCK", "SORT" };
		MP_ProductDAO dao = new MP_ProductDAO();
		ArrayList<MP_ProductVO> list = dao.list();

		Object[][] all = new Object[list.size()][5];
		if (list.size() != 0) {
			for (int i = 0; i < all.length; i++) {
				all[i][0] = list.get(i).getCode();
				all[i][1] = list.get(i).getName();
				all[i][2] = list.get(i).getCost();
				all[i][3] = list.get(i).getStock();
				all[i][4] = list.get(i).getSort();
			}
		} else {
			System.out.println("검색결과 없음");
		}
		// ----------------------------------------------------------

		JFrame f = new JFrame();
		f.setSize(528, 600);
		f.getContentPane().setBackground(Color.white);
		
		// CREATE NEW // PANEL TABLE
		ImageIcon icon = new ImageIcon("Olive.png");
		JLabel l1 = new JLabel(icon);
		JLabel l2 = new JLabel("				제품 관리");
		JButton b1 = new JButton("제품등록");
		JButton b2 = new JButton("제품검색");
		JButton b3 = new JButton("제품재고수정");
		JButton b4 = new JButton("단종제품삭제");
		JButton b5 = new JButton("새로고침");

		// 표넣는 방법
		JPanel p = new JPanel();
		JTable table = new JTable(all, header);
		scrollPane = new JScrollPane(table);
		
		// SET FLOW
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		// SET FONT
		Font font1 = new Font("D2Conding", Font.BOLD, 40);
		Font font2 = new Font("D2Conding", Font.CENTER_BASELINE, 12);
		Font font3 = new Font("돋움", Font.BOLD, 30);
		Font font4 = new Font("D2Conding", Font.CENTER_BASELINE, 12);
		
		l2.setForeground(new Color(166,203,71));
		Color c1 = new Color(155,206,39);
		Color c2 = new Color(190,232,81);
		b1.setBackground(c1);
		b1.setForeground(Color.white);
		b2.setBackground(c1);
		b2.setForeground(Color.white);
		b3.setBackground(c1);
		b3.setForeground(Color.white);
		b4.setBackground(c1);
		b4.setForeground(Color.white);
		b5.setBackground(c1);
		b5.setForeground(Color.white);
		p.setBackground(c1);
		
		
		l1.setFont(font1);
		l2.setFont(font3);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);
		b5.setFont(font2);

		// Add button function
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("제품의 이름은?");
				if (name.equals("")) {
					JOptionPane.showMessageDialog(f, "제품 이름 입력은 필수입력 항목입니다.");
					name = JOptionPane.showInputDialog("제품의 이름은?");
				}

				String cost = JOptionPane.showInputDialog("제품의 가격은?");
				if (cost.equals("")) {
					JOptionPane.showMessageDialog(f, "cost는 필수입력 항목입니다.");
					cost = JOptionPane.showInputDialog("제품의 가격은?");
				}

				String stock_st = JOptionPane.showInputDialog("제품의 재고는?");
				if (stock_st.equals("")) {
					JOptionPane.showMessageDialog(f, "재고는 필수입력 항목입니다.");
					stock_st = JOptionPane.showInputDialog("제품의 재고는?");
				}
				int stock = Integer.parseInt(stock_st);

				String sort = JOptionPane.showInputDialog("제품의 종류는?");

				MP_ProductDAO dao = new MP_ProductDAO();
				MP_ProductVO bag = new MP_ProductVO();

				bag.setName(name);
				bag.setCost(cost);
				bag.setStock(stock);
				bag.setSort(sort);

				try {
					// 3.가방을 전달한다.
					int result = dao.insert(bag);
					if (result != 0) {
						JOptionPane.showMessageDialog(f, "제품 등록이 완료 되었습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "제품 등록을 실패하였습니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name2 = JOptionPane.showInputDialog("검색할 제품의 이름은?");
				if (name2.equals("")) {
					JOptionPane.showMessageDialog(f, "제품 이름 입력은 필수입력 항목입니다.");
					name2 = JOptionPane.showInputDialog("검색할 제품의 이름은?");
				}

				String header[] = { "CODE", "NAME", "COST", "STOCK", "SORT" };
				MP_ProductDAO dao = new MP_ProductDAO();
				ArrayList<MP_ProductVO> SearchResult = dao.Search(name2);

				Object[][] all = new Object[SearchResult.size()][5];
				if (SearchResult.size() != 0) {
					for (int i = 0; i < all.length; i++) {
						all[i][0] = SearchResult.get(i).getCode();
						all[i][1] = SearchResult.get(i).getName();
						all[i][2] = SearchResult.get(i).getCost();
						all[i][3] = SearchResult.get(i).getStock();
						all[i][4] = SearchResult.get(i).getSort();
					}
				} else {
					System.out.println("검색결과 없음");
				}

				JFrame f = new JFrame();
				f.setSize(528, 600);
				f.getContentPane().setBackground(Color.white);

				JLabel l1 = new JLabel("검색 결과");
				JPanel panel = new JPanel();
				JTable table = new JTable(all, header);
				JScrollPane scrollPane = new JScrollPane(table);

				Font font1 = new Font("돋움", Font.BOLD, 35);
				l1.setFont(font1);
				
				
				l1.setForeground(new Color(166,203,71));
				panel.setBackground(new Color(155,206,39));

				
				
				
				FlowLayout flow = new FlowLayout();
				f.setLayout(flow);

				f.add(l1);
				f.getContentPane().add(panel, BorderLayout.PAGE_END);
				panel.add(scrollPane);

				// 화면 가운데로!
				f.setLocationRelativeTo(null);
				f.setVisible(true);
			}

		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String code_st = JOptionPane.showInputDialog("수정하고 싶은 제품의 코드는?");
				int code = Integer.parseInt(code_st);
				if (code_st.equals("")) {
					JOptionPane.showMessageDialog(f, "제품 코드 입력은 필수입력 항목입니다.");
					code_st = JOptionPane.showInputDialog("수정하고 싶은 제품의 코드는?");
					code = Integer.parseInt(code_st);
				}

				String stock_st = JOptionPane.showInputDialog("이 코드 상품의 변경 후 재고는?");
				int stock = Integer.parseInt(stock_st);
				if (stock_st.equals("")) {
					JOptionPane.showMessageDialog(f, "제품 재고 입력은 필수입력 항목입니다.");
					stock_st = JOptionPane.showInputDialog("이 코드 상품의 변경 후 재고는?");
					stock = Integer.parseInt(stock_st);
				}

				MP_ProductDAO dao = new MP_ProductDAO();
				MP_ProductVO bag = new MP_ProductVO();

				bag.setCode(code);
				bag.setStock(stock);

				try {
					dao.update(bag);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				JOptionPane.showMessageDialog(f, "제품 재고가 수정되었습니다.");

			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String code_st = JOptionPane.showInputDialog("삭제하고 싶은 제품의 코드는?");
				int code = Integer.parseInt(code_st);
				if (code_st.equals("")) {
					JOptionPane.showMessageDialog(f, "제품 코드 입력은 필수입력 항목입니다.");
					code_st = JOptionPane.showInputDialog("삭제하고 싶은 제품의 코드는?");
					code = Integer.parseInt(code_st);
				}

				MP_ProductDAO dao = new MP_ProductDAO();

				try {
					dao.delete(code);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				JOptionPane.showMessageDialog(f, "제품 삭제가 완료되었습니다.");

			}
		});
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				p.remove(scrollPane);
				
				String header[] = { "CODE", "NAME", "COST", "STOCK", "SORT" };
				MP_ProductDAO dao = new MP_ProductDAO();
				ArrayList<MP_ProductVO> list = dao.list();

				Object[][] all = new Object[list.size()][5];
				if (list.size() != 0) {
					for (int i = 0; i < all.length; i++) {
						all[i][0] = list.get(i).getCode();
						all[i][1] = list.get(i).getName();
						all[i][2] = list.get(i).getCost();
						all[i][3] = list.get(i).getStock();
						all[i][4] = list.get(i).getSort();
					}
				} else {
					System.out.println("검색결과 없음");
				}
				
				JTable table = new JTable(all, header);
				scrollPane = new JScrollPane(table);
				p.add(scrollPane);
				p.updateUI();
			}
		});

		f.add(l1);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);

		// 표 넣는 방법
		f.add(p, BorderLayout.PAGE_END);
		p.add(scrollPane);

		// Add to frame

		// 화면 가운데로!
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
