package com.ict03.class01;

import java.util.Scanner;
//사람마다 메뉴, 총액, 돈, 잔돈 30 25 35 30
public class Ex10_main {
	public static void main(String[] args) {
		System.out.println("몇 명이세요?");
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int price = 0;
		String menu =" ";
		Ex10[] order = new Ex10[people];
		for (int i = 0; i < people; i++) {
			System.out.println("메뉴를 골라주세요.");
			System.out.print(" 1.카페모카(3000)\r 2.아메리카노(2500)\r 3.카페라떼(3500)\r 4.주스(3000원)\r");
			int menu1 = sc.nextInt();
			Ex10 person = new Ex10(); //order[i]로 직접입력은 불가능.
			if(menu1 == 1) {
				person.setMenu("카페모카");
				person.setPrice(3000);
			} else if(menu1 == 2) {
				person.setMenu("아메리카노");
				person.setPrice(2500);
			} else if(menu1 == 3) {
				person.setMenu("카페라떼");
				person.setPrice(3500);
			} else if(menu1 == 4) {
				person.setMenu("주스");
				person.setPrice(3000);
			} 
			order[i] = person;
		}
		for (int i = 0; i < people; i++) {
			price += order[i].getPrice();
			menu += order[i].getMenu() + "/ ";
		}
		System.out.println(menu+"\r전부 "+ "총 "+ price +"원 입니다.");
		System.out.println("돈 넣으세요.");
		int money = sc.nextInt();
		int change = money-price;
		System.out.println("잔돈은 "+change+"원 입니다.");
	}
}
