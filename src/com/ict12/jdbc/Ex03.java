package com.ict12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		//DB 접속 필요한 class
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =null;
		int result = 0;
		
		
		try {
			//1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 접속정보
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test01";
			String pasw = "1111";
			
			conn = DriverManager.getConnection(url, user, pasw);
			
			//3. 쿼리문
			//custid가 7인 사람의 이름을 박찬호, 대한민국 서울로 변경.
			
			String sql = "update customer set name='박찬호', address = '대한민국 서울'"
					+ "where custid = 7";
			
			//실제 DB에 보내기
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			if (result > 0) {
				System.out.println(result + "개 작업 성공");
				
				sql = "select * from customer";

				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
					
			}}else {
				System.out.println("실패");
			}
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
}
}
