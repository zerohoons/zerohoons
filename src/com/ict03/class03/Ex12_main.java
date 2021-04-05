package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요 >>>>> 1.고양이 / 2.강아지");
		
		int s1 = scan.nextInt();
		
		//부모클래스를 이용해서 해보기.
		Ex09_Animal animal = null;
		if(s1 == 1) {
			animal = new Ex10_Cat();
			
		} else if (s1 == 2) {
			animal = new Ex11_Dog();
		}
		
		//실행메소드 입력
		animal.sound();
		animal.like();
		animal.sleep();
		//animal.hobby();  -> 단, 부모클래스에 없는 메소드는 사용불가
	
		/*
		if(s1 == 1) {
			
			Ex10_Cat cat = new Ex10_Cat();
			cat.sound();
			cat.hobby();
			cat.like();
			cat.sleep();
			
		} else if ( s1 == 2 ) {
			
			Ex11_Dog dog = new Ex11_Dog();
			dog.sound();
			dog.hobby();
			dog.like();
			dog.sleep();
		}
		*/
	}
}
