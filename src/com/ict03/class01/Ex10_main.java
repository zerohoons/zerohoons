package com.ict03.class01;

import java.util.Scanner;
//������� �޴�, �Ѿ�, ��, �ܵ� 30 25 35 30
public class Ex10_main {
	public static void main(String[] args) {
		System.out.println("�� ���̼���?");
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int price = 0;
		String menu =" ";
		Ex10[] order = new Ex10[people];
		for (int i = 0; i < people; i++) {
			System.out.println("�޴��� ����ּ���.");
			System.out.print(" 1.ī���ī(3000)\r 2.�Ƹ޸�ī��(2500)\r 3.ī���(3500)\r 4.�ֽ�(3000��)\r");
			int menu1 = sc.nextInt();
			Ex10 person = new Ex10(); //order[i]�� �����Է��� �Ұ���.
			if(menu1 == 1) {
				person.setMenu("ī���ī");
				person.setPrice(3000);
			} else if(menu1 == 2) {
				person.setMenu("�Ƹ޸�ī��");
				person.setPrice(2500);
			} else if(menu1 == 3) {
				person.setMenu("ī���");
				person.setPrice(3500);
			} else if(menu1 == 4) {
				person.setMenu("�ֽ�");
				person.setPrice(3000);
			} 
			order[i] = person;
		}
		for (int i = 0; i < people; i++) {
			price += order[i].getPrice();
			menu += order[i].getMenu() + "/ ";
		}
		System.out.println(menu+"\r���� "+ "�� "+ price +"�� �Դϴ�.");
		System.out.println("�� ��������.");
		int money = sc.nextInt();
		int change = money-price;
		System.out.println("�ܵ��� "+change+"�� �Դϴ�.");
	}
}
