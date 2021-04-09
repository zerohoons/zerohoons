package com.ict07.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* Class InetAddress
 * - �ڹٿ��� IP�ּҸ� ǥ���ϴ� class.
 * - �����ڰ� ����������, ������� �ʴ´�.
 *  ��localhost : ���� ���� ����ϰ� �ִ� ��ǻ��
 * - 6���� static �޼ҵ带 �̿��Ѵ�.
 * 	 static �޼ҵ� : getAllByName(String host), getByAddress(byte[] addr),getByAddress(String host, byte[] addr)
 * 				 	getByName(String host)	getLocalHost()	getLoopbackAddress()  */
public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress add = InetAddress.getByName("www.naver.com"); //new ������� ����.
			System.out.println("�̸� : " + add.getHostName());
			System.out.println("�ּ� : "+ add.getHostAddress());
			System.out.println("toString : " + add.toString());
			System.out.println("=============================");
			
			//�� ��ǻ�� ����
			add = InetAddress.getLocalHost();
			System.out.println("�̸� : " + add.getHostName());
			System.out.println("�ּ� : "+ add.getHostAddress());
			System.out.println("toString : " + add.toString());
			System.out.println("=============================");
			
			InetAddress[] addrs = InetAddress.getAllByName("www.daum.net");
			for (InetAddress k : addrs) {
				
				System.out.println("�̸� : " + k.getHostName());
				System.out.println("�ּ� : "+ k.getHostAddress());
				System.out.println("toString : " + k.toString());
				System.out.println("=============================");
			}
			System.out.println("=============================");
			
			//125.209.222.137
			byte[] b = {(byte)223,(byte)130,(byte)195,(byte)200}; //128 �̻��� ���� ���� -> byte�� ����ȯ
			add = InetAddress.getByAddress(b);
			System.out.println("�̸� : " + add.getHostName());
			System.out.println("�ּ� : "+ add.getHostAddress());
			System.out.println("toString : " + add.toString());
			System.out.println("=============================");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
	}
}
