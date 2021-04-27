package com.ict12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		/* JDBC(JAVA DATABASE CONNECTIVITY) �� �ڹٿ��� ������ ���̽��� ������ �� �ֵ��� �ϴ� �ڹ� API.
		 * JDBC�� DB���� �ڷḦ �����ϰų� ������Ʈ�ϴ� ����� �����Ѵ�.
		 * �� ������ ���̽��鿡�� ������ �� �ִ� ����̹��� �ʿ��ϴ�. 
		 * ������Ʈ (���콺 ������) - build path - configure build path - add Extenal jars - �ش� ���̺귯�� ����*/

		//DBó���� �ʿ��� Ŭ���� 3������
		Connection conn = null; //DB ���� �� �ʿ�
		Statement stmt = null; //java.sql Ŭ����.
		ResultSet rs = null; //jaca.sql Ŭ���� : select ���� ����� �޾Ƽ� ó��.
		int result = 0; //insert, update, delete�� ���
		try {
			//1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. ������ ���� ���� 3��
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC"; //�ڽ� IP �ּ�
			String user = "TEST01";
			String pasw = "1111";
			conn = DriverManager.getConnection(url, user, pasw);
			
			//3. ������ �ۼ� (,CRUD = ���۾�(insert, update, delete, select)
			String sql = "insert into customer (custid, name, address, phone)"
					+ "values(10,'�����', '���� ����', '010-6000-0001')";
			
			//4. ���� DB�� ����. 
			stmt = conn.createStatement();
			
			//5. statement Ŭ������ ���� ���� ��, DB�� ����� �޾Ƽ� ó���Ѵ�.
			// select ���� ���, ResultSet Ŭ������ �̿��Ͽ� ����� �޴´�.
			// select ���� �ƴҰ��, int �� ������, result = stmt.executeUpdate(sql) �� ��� �ޱ�. 
			
			result = stmt.executeUpdate(sql);
			
			//6. �������
			// .next() : �����ٿ� ������ ������ true
//			while(rs.next()) {
//				System.out.print(rs.getInt("custid")+"\t");
//				System.out.print(rs.getString("name")+"\t");
//				System.out.print(rs.getString("address")+"\t");
//				System.out.println(rs.getInt("phone"));
//				
//			}
			
			if (result != 0) {
				System.out.println(result + "�� �۾� ����");
				
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

