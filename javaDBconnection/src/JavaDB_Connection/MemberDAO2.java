package JavaDB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import JDBC_for_product.ProductVO;
import 화면DB_Connection2.MemberVo;

public class MemberDAO2 {
	
	
	public int insert(MemberVo bag) {
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
			String sql = "insert into HR.MEMBER VALUES(?,?,?,?)"; //** 이거 ?가 문법이야.
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			
			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			result = ps.executeUpdate(); //**
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int delete(String id) {
		int result =0;
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
			String sql = "DELETE FROM HR.MEMBER WHERE ID = ? ";
			PreparedStatement ps= con.prepareStatement(sql); //**
			ps.setString(1, id);
			
			System.out.println("3: SQL만들기 성공.");
			
			
			//4.DB로 전송
			result = ps.executeUpdate();  //**
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int update(MemberVo bag) {
		int result= 0;
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
			String sql = "UPDATE HR.MEMBER SET TEL =? WHERE ID= ? ";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, bag.getTel());
			ps.setString(2, bag.getId());
			
			System.out.println("3: SQL만들기 성공.");
			
			
			//4.DB로 전송
			result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	public MemberVo select_one(String id) {
		ResultSet rs = null;
		//기본형 정수/실수/문자/논리만 값으로 초기화 
		//나머지 데이터형(참조형)
		MemberVo bag = null;
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
			String sql = "SELECT * FROM HR.MEMBER WHERE ID = ? ";
			PreparedStatement ps= con.prepareStatement(sql); //**
			ps.setString(1, id);
			
			System.out.println("3: SQL만들기 성공.");
			
			
			//4.DB로 전송
			rs = ps.executeQuery();  //**
			System.out.println("4: DB로 전송 성공.");
			if(rs.next()) {
				System.out.println("검색결과 있음, 성공");
				String id2 = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
			
				bag = new MemberVo();
				
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);	
			}else {
				System.out.println("검색결과 없음, 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}
	
	public int login(MemberVo bag) {
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
			String sql = "SELECT * FROM HR.MEMBER WHERE ID = ? and PW = ? ";
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
	
	
}