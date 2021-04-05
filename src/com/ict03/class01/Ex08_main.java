package com.ict03.class01;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08 coffee = new Ex08(); //같은 클래스로 만들면 내용구조가 동일하다.
		coffee.setName("커피");	  
		coffee.setPrice(1800);
		
		Ex08 ion = new Ex08();	  //클래스는 재사용이 가능하다. 각각의 이름으로.
		ion.setName("이온음료");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("탄산음료");
		cola.setPrice(2000);
		
		Ex08 juice = new Ex08();
		juice.setName("과일음료");
		juice.setPrice(2200);
		
		//배열에도 활용이 가능
		//자료형 [] 이름 = new 자료형 갯수
		 /*
		Ex08[] arr = new Ex08[4]; //클래스를 자료형으로 이용을 한다 = 참조자료형
		arr[0] = coffee;
		arr[1] = ion;
		arr[2] = cola;
		arr[3] = juice;
		*/
		Ex08[] arr = {coffee, ion, cola, juice}; //이렇게도 배열 가능
		
		//arr 배열이 갖는 이름, 가격을 출력하자.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+" , " +arr[i].getPrice());
		}
		
		
		//동전 투입
		//1500원 이상 -> 구입 가능(금액에 따라 제한적) / 1500미만 -> 금액미달
		
		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 투입하세요");
		int money = sc.nextInt();
		
		first:
		while(true) {
		if(money >= 1500) {
				//System.out.println("1. 커피\t2.이온\t3.탄산\t4.주스");
				for (int i = 0; i < arr.length; i++) {
					if(arr[i].getPrice()<=money) {
						System.out.print((i+1)+"."+arr[i].getName()+" (O) ");
					}else {
						System.out.print((i+1)+". "+arr[i].getName()+" (X) ");
					}
				}
			}else {
				System.out.println("금액부족");
		}
		System.out.println();
		System.out.print("번호로 선택하세요 >> ");
		
		int sel = sc.nextInt();
		int change = 0;
		for (int i = 0; i < arr.length; i++) {
			if(sel == (i+1)) {
				change = money - arr[i].getPrice();
				System.out.println(arr[i].getName()+" 과 잔돈 "+change+ "원 입니다.");
				if(change>=1500) {
					continue first;
				}
			else {
				break first;
			}
		}
		/*
		 for 을 사용하지 않고, if로 하나하나 입력해도 가능.
		 */	
		}
	}
	}
}

