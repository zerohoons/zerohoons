package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		/* ���� ĳġ��
		 * try{
		 * }catch(1){ ������ü�� �ڿ��ٰ� ��. => exception �� �� �ڿ� ���� �ɷ� ����ص���.
		 * }catch(2){
		 * }catch(3){ } */
		
		Scanner sc = new Scanner(System.in);
		try {
		
		int var = 27;
		System.out.println("���� �Է�");
		
		int su = sc.nextInt();
		System.out.println("���� : " + (var/su));
		
		} catch (InputMismatchException e) {
			System.out.println("������ �Է��ϼ���.");
		} catch (ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����.");
		} catch (Exception e) {
			System.out.println("���� �Ҹ��̼���?" + e ); //e �� ����ϸ� ���� �������� �� �� ����.
		}
		//exception �� �Է��� ��� �̴� ���� �ؿ� �����ؾ��Ѵ�. �� �̿ܿ��� ũ�� �������.
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("�����ϼ̽��ϴ�.");

	}
}
