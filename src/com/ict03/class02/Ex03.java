package com.ict03.class02;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		//Random : Math.random(); Random Ŭ����
		 
		//1. Random Ŭ����
		Random rand = new Random();
		
		//���� �ڷ����� �����͸� �������� ����.
		System.out.println("====================");
		System.out.println("boolean �� " + rand.nextBoolean());
		System.out.println("int �� " + rand.nextInt());
		System.out.println("long �� " + rand.nextLong());
		
		//�Ǽ����´� 0.0~1.0�̸��� �⺻
		System.out.println("====================");
		System.out.println("float �� " + rand.nextFloat());
		System.out.println("double �� " + rand.nextDouble());
		
		//Ư�� ������ �����ؼ� ����ϴ� ���
		//1) nextInt(����) : 0 ~ ���� ������ ������ �� �߻�/
		
		System.out.println("====================");
		int s1 = rand.nextInt(3); //0 ~ 2 �� ����
		System.out.println(s1);
		
		//2) (int)(nextDouble()*����) : 0 ~ ���������� ������ �� �߻�
		
		System.out.println("====================");
		int s2 = (int)(rand.nextDouble()*3); // 0 - 2 �� ���� �� �߻�
		System.out.println(s2);
		
		//2. Math Ŭ���� - �����ڰ� ���� -> ��� �޼ҵ尡 static -> ��ü �������� ȣ�� ����.
		
		//1) random() : 0.0 ~ 1.0 �̸�
		
		System.out.println("====================");
		System.out.println(Math.random());
		
		//Ư�� ������ �����ؼ� ����ϴ� ���
		//2) (int)(Math.random()*����) : 0 ~ ���������� ������ �� �߻�
		
		System.out.println("====================");
		int s3 = (int)(Math.random()*3);
		System.out.println(s3); // 0 - 2 �� ���� �� �߻�
		
		//3) abs : ���밪 ��ȯ
		
		System.out.println("====================");
		System.out.println(Math.abs(-100));
		System.out.println(Math.abs(100));
		
		//4) ceil, round, floor : �ø�, �ݿø�, ����
		
		System.out.println("====================");
		System.out.println(Math.ceil(3.45));
		System.out.println(Math.ceil(3.55));
		System.out.println("====================");
		System.out.println(Math.round(3.45));
		System.out.println(Math.round(3.55));
		System.out.println("====================");
		System.out.println(Math.floor(3.45));
		System.out.println(Math.floor(3.55));
		System.out.println("====================");
		
		//5) max / min : �ΰ��� �� �߿� ũ�ų� �������� ã��.
		
		System.out.println("max : "+ Math.max(44.9,45));
		System.out.println("min : "+Math.min(-44.5, -45));
		System.out.println("====================");
		
		//6) pow(double a, double b) : ���� == a�� b��
		
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(3, 2));
		}
}
