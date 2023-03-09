package JDBC_for_product;

import java.util.Scanner;

import javax.swing.JOptionPane;

import JavaDB_Connection.MemberDAO2;
import 화면DB_Connection2.MemberVo;

public class 회원한명검색 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("검색할 아이디를 입력하세요.");
		String id =  sc.next();
		
		MemberDAO2 dao = new MemberDAO2();
		MemberVo bag = dao.select_one(id);
		String total = bag.getId()+bag.getPw()+bag.getName()+bag.getTel();
		JOptionPane.showMessageDialog(null, total);
	}

}
