package com.ict12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		/* JDBC(JAVA DATABASE CONNECTIVITY) 는 자바에서 데이터 베이스에 접속할 수 있도록 하는 자바 API.
		 * JDBC는 DB에서 자료를 쿼리하거나 업데이트하는 방법을 제공한다.
		 * 각 데이터 베이스들에게 접속할 수 있는 드라이버가 필요하다. 
		 * 프로젝트 (마우스 오른쪽) - build path - configure build path - add Extenal jars - 해당 라이브러리 선택*/

		//DB처리에 필요한 클래스 3개선언
		Connection conn = null; //DB 접속 시 필요
		Statement stmt = null; //java.sql 클래스.
		ResultSet rs = null; //jaca.sql 클래스 : select 문의 결과를 받아서 처리.
		int result = 0; //insert, update, delete의 결과
		try {
			//1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속을 위한 정보 3개
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC"; //자신 IP 주소
			String user = "TEST01";
			String pasw = "1111";
			conn = DriverManager.getConnection(url, user, pasw);
			
			//3. 쿼리문 작성 (,CRUD = 조작어(insert, update, delete, select)
			String sql = "insert into customer (custid, name, address, phone)"
					+ "values(10,'손흥민', '영국 런던', '010-6000-0001')";
			
			//4. 실제 DB에 접속. 
			stmt = conn.createStatement();
			
			//5. statement 클래스에 쿼리 저장 후, DB에 결과를 받아서 처리한다.
			// select 문일 경우, ResultSet 클래스를 이용하여 결과를 받는다.
			// select 문이 아닐경우, int 가 받으며, result = stmt.executeUpdate(sql) 로 결과 받기. 
			
			result = stmt.executeUpdate(sql);
			
			//6. 결과보기
			// .next() : 다음줄에 정보가 있으면 true
//			while(rs.next()) {
//				System.out.print(rs.getInt("custid")+"\t");
//				System.out.print(rs.getString("name")+"\t");
//				System.out.print(rs.getString("address")+"\t");
//				System.out.println(rs.getInt("phone"));
//				
//			}
			
			if (result != 0) {
				System.out.println(result + "개 작업 성공");
				
				sql = "select * from customer";

				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
					
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}	finally {			
			try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e2) {
				}
			}
		}
	}

