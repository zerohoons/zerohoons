package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		/*	throws : ���ܸ� ó���ϱ� ���ٴ�, �߻��� ���ܰ�ü�� �絵�ϴ� ��.
		 * 	���� �޼ҵ忡�� ����ó���� �ϱ� ����� ��, ���� ������ ȣ���� ������ ���� ���������� ��.
		 * => ���ܰ� �߻��ϸ� ���ܸ� ó������ �ʰ�, �ڽ��� ȣ���� ������ ���ܰ�ü�� �����ϴ� ��.
		 * 	throws�� �絵�� �� �� �ذ��ϴ� ���� �ƴϱ� ������ try~catch ������ �ذ��� �ؾ��Ѵ�. */
		
		Ex05 test = new Ex05();
		Scanner sc = new Scanner(System.in);
	try {
		System.out.println("�����Է� : ");
		String msg = sc.next();
		test.setData(msg);
		
	} catch (Exception e) {
		System.out.println("ù���ڴ� ���ڷ� �Է��ϼ���");
	}
	}	
		public void setData(String msg) throws NumberFormatException{
			// msg�� ���̰� 1 �̻��� ���.
			if(msg.length()>=1) {
				String str = msg.substring(0,1);
				prnData(str);
			}
		}
		
		public void prnData(String str) throws NumberFormatException {
			int dan = Integer.parseInt(str);
			System.out.println(dan+"��");
			for (int i = 0; i < 10; i++) {
				System.out.println(dan + "*" + i + "="+ (dan*i));
			}
		}
}
