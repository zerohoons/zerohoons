package com.ict03.class01;

public class Ex11_main {
	public static void main(String[] args) {
		/*
		Ex11 test1 = new Ex11(); //private ������ �⺻������ ���� ������ �ʱ�ȭ.
		System.out.println("�̸� " + test1.getName());
		System.out.println("���� " + test1.getAge());
		System.out.println("���� " + test1.isGender());
		System.out.println();
		*/
		
		Ex11 test2 = new Ex11("�ʶ���", 3); 
//������ �ȿ��� �ƹ��� �۾��� ������ ��ȭ ����(Ex11 39 ����)
		
		//setter�� �̿��� ����ʵ� ���� ����
		test2.setName("�ȴ���");
		System.out.println("�̸� " + test2.getName());
		System.out.println("���� " + test2.getAge());
		System.out.println("���� " + test2.isGender());
		System.out.println();
		
		//setter�� �̿��� ����ʵ� ���� ����
		
		Ex11 test3 =new Ex11(45, "������");
		System.out.println("�̸� " + test3.getName());
		System.out.println("���� " + test3.getAge());
		System.out.println("���� " + test3.isGender());
		
		//���� ������ �ٸ� �͸����ε� �����ڴ� �޶��� => �����ε�
	}
}
