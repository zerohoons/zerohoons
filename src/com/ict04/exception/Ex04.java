package com.ict04.exception;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		/* finally : ���ܰ� �߻��ϵ� �߻����� �ʵ� �ݵ�� �����ؾ��ϴ� ������ ó���� �� ���.
		 * try { } catch( ){ } �ڿ� ��ġ�Ѵ�.
		   finally { ������ ���� }�� ������ ��� �ִ�.*/
		
		Scanner sc = new Scanner(System.in);
		try {
		
		int var = 27;
		System.out.println("���� �Է�");
		
		int su = sc.nextInt();
		System.out.println("���� : " + (var/su));
		//return;
		}  catch (Exception e) {
			System.out.println("���� �Ҹ��̼���? " + e ); 
			return;
		} finally {
			System.out.println("�ݵ�� �����ؾ��� ����."); 
		}
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
