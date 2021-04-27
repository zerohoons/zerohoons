package com.ict12.jdbc;
	
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement statm = null;
		ResultSet rs = null;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://203.236.220.101:3306/test02?characterEncoding=UTF-8&serverTimezone=UTC";
			String users = "test02";
			String pasw = "2222";
			
			conn = DriverManager.getConnection(url, users, pasw);
			write:
			while(true){
				System.out.println("�Է��� ���� ��ȣ, �̸�, ����, �ּ�, ��ȭ��ȣ ������� �Է��ϼ���");
				int no = sc.nextInt();
				String name = sc.next();
				String det = sc.next();
				String addr = sc.next();
				String tel = sc.next();
				//���� ���� ����
				list.add(new VO(no, name, det, addr, tel));
				
				while(true) {
					System.out.println("��� �Է��Ͻðڽ��ϱ�?  y/n");
					String message = sc.next();
					if(message.equalsIgnoreCase("y")) {
						continue write;
					}else if (message.equalsIgnoreCase("n")) {
						break write;
					}else {
						continue;
					}
				} }	
			//���� ���� ó��
			for (int i = 0; i < list.size(); i++) {
				String sql = "insert into students (No, name, det, addr, tel)" 
						+"values( "+list.get(i).getNo()+" , '"+list.get(i).getName()+"' , '"+list.get(i).getDet()+"' , '"
						+list.get(i).getAddr()+"' , '"+list.get(i).getTel()+"')";
				
				statm = conn.createStatement();
				result = statm.executeUpdate(sql);
				
			}		

			
			String sql = "select * from students";
			statm = conn.createStatement();
			rs = statm.executeQuery(sql);
			System.out.println("��ȣ\t�̸�\t����\t�ּ�\t��ȭ��ȣ");
			while(rs.next()) {
				System.out.print(rs.getInt("No")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("det")+"\t");
				System.out.print(rs.getString("addr")+"\t");
				System.out.println(rs.getString("tel")+"\t");
			}
			
		} catch (Exception e) {
			System.out.println("�۾����� : " + e);
			// TODO: handle exception
		}finally {
			try {
				rs.close();
				statm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}

