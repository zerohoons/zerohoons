package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ϼ��� >>>>> 1.����� / 2.������");
		
		int s1 = scan.nextInt();
		
		//�θ�Ŭ������ �̿��ؼ� �غ���.
		Ex09_Animal animal = null;
		if(s1 == 1) {
			animal = new Ex10_Cat();
			
		} else if (s1 == 2) {
			animal = new Ex11_Dog();
		}
		
		//����޼ҵ� �Է�
		animal.sound();
		animal.like();
		animal.sleep();
		//animal.hobby();  -> ��, �θ�Ŭ������ ���� �޼ҵ�� ���Ұ�
	
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
