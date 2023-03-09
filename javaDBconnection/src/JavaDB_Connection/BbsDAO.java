package JavaDB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB_Connection2.BbsVo;
import 화면DB_Connection2.MemberVo;

public class BbsDAO {
	
	//BBS당 DAO 하나 
	public void insert(String no, String title, String content, String writer) {
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
			String sql = "insert into HR.BBS VALUES(?,?,?,?)"; //** 이거 ?가 문법이야.
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			
			System.out.println("3: SQL만들기 성공.");

			// 4.DB로 전송
			int result = ps.executeUpdate(); //**
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete(String no) {
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
			String sql = "DELETE FROM HR.BBS WHERE \"no\"= ? ";
			PreparedStatement ps= con.prepareStatement(sql); //**
			ps.setString(1, no);
			
			System.out.println("3: SQL만들기 성공.");
			
			
			//4.DB로 전송
			int result = ps.executeUpdate();  //**
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(String content, String no) {
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
			String sql = "UPDATE HR.BBS SET CONTENT =? WHERE \"no\"= ? ";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, content);
			ps.setString(2, no);
			
			System.out.println("3: SQL만들기 성공.");
			
			
			//4.DB로 전송
			int result = ps.executeUpdate();
			System.out.println(result);
			System.out.println("4: DB로 전송 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public BbsVo select_one(String no) {
		ResultSet rs = null;
		//기본형 정수/실수/문자/논리만 값으로 초기화 
		//나머지 데이터형(참조형)
		BbsVo bag = null;
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
			String sql = "SELECT * FROM HR.BBS WHERE \"no\" = ? ";
			PreparedStatement ps= con.prepareStatement(sql); //**
			ps.setString(1, no);
			
			System.out.println("3: SQL만들기 성공.");
			
			
			//4.DB로 전송
			rs = ps.executeQuery();  //**
			System.out.println("4: DB로 전송 성공.");
			if(rs.next()) {
				System.out.println("검색결과 있음, 성공");
				String no2 = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
			
				bag = new BbsVo();
				
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);	
			}else {
				System.out.println("검색결과 없음, 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}
	
	
	
}