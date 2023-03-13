package MiniProject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SearchUI_Test {

	public static void main(String[] args) {
		// ---------------------------------------------------------
		// list 가져와서 가방 하나하나 꺼내보기
		String header[] = { "CODE", "NAME", "COST", "STOCK", "SORT" };
		MP_ProductDAO dao = new MP_ProductDAO();
		ArrayList<MP_ProductVO> SearchResult = dao.Search("바디");

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
		JLabel l1 = new JLabel("<검색 결과>        ");
		JPanel panel = new JPanel();
		JTable table = new JTable(all, header);
		JScrollPane scrollPane = new JScrollPane(table);

		Font font1 = new Font("D2Conding",Font.BOLD,40);
		Font font2 = new Font("D2Conding",Font.BOLD,20);
		l1.setFont(font1);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
				
		f.add(l1);
		f.getContentPane().add(panel, BorderLayout.PAGE_END);
		panel.add(scrollPane);
		
		
		//화면 가운데로! 
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

}
