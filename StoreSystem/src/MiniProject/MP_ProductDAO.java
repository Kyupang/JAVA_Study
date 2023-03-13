package MiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MP_ProductDAO {

	public ArrayList<MP_ProductVO> list() {
		ArrayList<MP_ProductVO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			// 1. 오라클 11g 와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver"); // **
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자(java---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: 오라클 연결 성공.");

			// 3. SQL 문 만들고
			String sql = "SELECT * FROM HR.MP_PRO"; // ** 이거 ?가 문법이야.
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			rs = ps.executeQuery(); // ** result set으로 한 row 받음 
			while(rs.next()) {
				//2. 한줄씩 보면서 있나없나 검사 
				int code = rs.getInt(1);
				String name = rs.getString(2);
				String cost = rs.getString(3);
				int stock = rs.getInt(4);
				String sort =  rs.getString(5);
				//System.out.println(code+name+cost+stock+sort);
				
				//3. 가방을 만들자
				MP_ProductVO bag = null;
				bag = new MP_ProductVO();
				bag.setCode(code);
				bag.setCost(cost);
				bag.setName(name);
				bag.setStock(stock);
				bag.setSort(sort);
				
				//4. list에 bag을 추가해주자.
				list.add(bag);
			}
			ps.close(); con.close(); rs.close();
			System.out.println("검색결과 :  "+list.size());
			System.out.println("4: DB로 전송 성공.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<MP_ProductVO> Search(String name) {
		ArrayList<MP_ProductVO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			// 1. 오라클 11g 와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver"); // **
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자(java---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: 오라클 연결 성공.");

			// 3. SQL 문 만들고
			String sql = "SELECT * FROM HR.MP_PRO WHERE NAME LIKE '%'||?||'%'"; // ** 이거 ?가 문법이야.
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3: SQL만들기 성공.");
			ps.setString(1, name);

			// 4.DB로 전송
			rs = ps.executeQuery(); // ** result set으로 한 row 받음 
			while(rs.next()) {
				//2. 한줄씩 보면서 있나없나 검사 
				int code = rs.getInt(1);
				String name2 = rs.getString(2);
				String cost = rs.getString(3);
				int stock = rs.getInt(4);
				String sort =  rs.getString(5);
				
				//3. 가방을 만들자
				MP_ProductVO bag = null;
				bag = new MP_ProductVO();
				bag.setCode(code);
				bag.setCost(cost);
				bag.setName(name2);
				bag.setStock(stock);
				bag.setSort(sort);
				
				System.out.println(code+" "+name2+" "+cost+" "+stock+" "+sort+" ");
				//4. list에 bag을 추가해주자.
				list.add(bag);
			}
			ps.close(); con.close(); rs.close();
			System.out.println("검색결과 :  "+list.size());
			System.out.println("4: DB로 전송 성공.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
 	public int insert(MP_ProductVO bag) {
		int result = 0;
		try {
			// 1. 오라클 11g 와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver"); // **
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자(java---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: 오라클 연결 성공.");

			// 3. SQL 문 만들고
			String sql = "insert into HR.MP_PRO VALUES(HR.MP_PRO_ID_SEQ.NEXTVAL,?,?,?,?)"; // ** 이거 ?가 문법이야.
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, bag.getName());
			ps.setString(2, bag.getCost());
			ps.setInt(3, bag.getStock());
			ps.setString(4, bag.getSort());

			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			result = ps.executeUpdate(); // **
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int delete(int code) {
		int result = 0;
		try {
			// 1. 오라클 11g 와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver"); // **
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자(java---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: 오라클 연결 성공.");

			// 3. SQL 문 만들고
			String sql = "DELETE FROM HR.MP_PRO WHERE CODE = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // **
			ps.setInt(1, code);

			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			result = ps.executeUpdate(); // **
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(MP_ProductVO bag) {
		int result = 0;
		try {
			// 1. 오라클 11g 와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver"); // **
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자(java---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: 오라클 연결 성공.");

			// 3. SQL 문 만들고
			String sql = "UPDATE HR.MP_PRO SET STOCK =? WHERE CODE= ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bag.getStock());
			ps.setInt(2, bag.getCode());

			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public int cusLogin(JoinVO bag) {
		int result = 0;
		//기본형 정수/실수/문자/논리만 값으로 초기화 
		//나머지 데이터형(참조형)
		try {
			//1. 오라클 11g 와 연결할 부품 설정 
			Class.forName("oracle.jdbc.driver.OracleDriver"); //**
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			//2. 오라클 11g에 연결해보자(java---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //**
			System.out.println("2: 오라클 연결 성공.");
			
			//3. SQL 문 만들고
			String sql = "SELECT * FROM HR.MP_CUS WHERE ID = ? and PW = ? ";
			PreparedStatement ps= con.prepareStatement(sql); //**
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			
			System.out.println("3: SQL만들기 성공.");
			
			
			//4.DB로 전송
			ResultSet rs = ps.executeQuery();  //**
			System.out.println("4: DB로 전송 성공.");
			if(rs.next()) {
				System.out.println("검색결과 있음, 성공");
				result =1;
			}else {
				System.out.println("검색결과 없음, 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int staLogin(MP_StaffVO bag) {
		int result = 0;
		//기본형 정수/실수/문자/논리만 값으로 초기화 
		//나머지 데이터형(참조형)
		try {
			//1. 오라클 11g 와 연결할 부품 설정 
			Class.forName("oracle.jdbc.driver.OracleDriver"); //**
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			
			//2. 오라클 11g에 연결해보자(java---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //**
			System.out.println("2: 오라클 연결 성공.");
			
			//3. SQL 문 만들고
			String sql = "SELECT * FROM HR.MP_STA WHERE ID = ? and PW = ? ";
			PreparedStatement ps= con.prepareStatement(sql); //**
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			
			System.out.println("3: SQL만들기 성공.");
			
			
			//4.DB로 전송
			ResultSet rs = ps.executeQuery();  //**
			System.out.println("4: DB로 전송 성공.");
			if(rs.next()) {
				System.out.println("검색결과 있음, 성공");
				result =1;
			}else {
				System.out.println("검색결과 없음, 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public MP_ProductVO select_one(String name) {
		ResultSet rs = null;
		// 기본형 정수/실수/문자/논리만 값으로 초기화
		// 나머지 데이터형(참조형)
		MP_ProductVO bag = null;
		try {
			// 1. 오라클 11g 와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver"); // **
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			// 2. 오라클 11g에 연결해보자(java---- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // **
			System.out.println("2: 오라클 연결 성공.");

			// 3. SQL 문 만들고
			String sql = "SELECT * FROM HR.MP_PRO WHERE NAME LIKE '%'||?||'%'"; // LIKE %?%";
			PreparedStatement ps = con.prepareStatement(sql); // **
			ps.setString(1, name);
			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			rs = ps.executeQuery(); // **
			System.out.println("4: DB로 전송 성공.");
			if (rs.next()) {
				System.out.println("검색결과 있음, 성공");
				int code = rs.getInt(1);
				String name2 = rs.getString(2);
				String cost = rs.getString(3);
				int stock = rs.getInt(4);
				String sort = rs.getString(5);

				bag = new MP_ProductVO();

				bag.setCode(code);
				bag.setName(name2);
				bag.setCost(cost);
				bag.setStock(stock);
				bag.setSort(sort);

			} else {
				System.out.println("검색결과 없음, 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}


}
