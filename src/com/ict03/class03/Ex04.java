package com.ict03.class03;

public class Ex04 {
	public static void main(String[] args) {
		Ex03 t1 = new Ex03();
		//��ü������ ���, �ڽ� Ŭ������ �θ����� �켱 ����Ǵ� ���� �θ� Ŭ�����̴�.
		System.out.println(t1);
		
		//��� �̿� �켱 ���� (�������� -> �ǿ����� -> ��Ӻ��� ->����� ����� ���~~~~~)
		//�θ�� �ڽ��� ���� �̸��� �ʵ带 ���� ������ �ڽ�Ŭ���� ����ʵ带 �켱���� �̿��Ѵ�.
		System.out.println(t1.name);
		//�ڽ�Ŭ������ �������� �ʴ� ����� ���, �θ�Ŭ������ ����� �̿��Ѵ�.
		System.out.println(t1.addr);
		
		//�޼ҵ� ���� �̿� ���������̴�.
		t1.sound();
		t1.study();
		
		//�ڽİ� �θ� ���� �޼ҵ带 ������ �ִٸ�, (�������̵��� ���) �ڽ�Ŭ���� �޼ҵ带 �켱���.
		t1.poppy();
		System.out.println("=====================");
		
		//static�� ��ü ������ �������.
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
	}
}
