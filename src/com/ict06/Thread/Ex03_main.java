package com.ict06.Thread;

public class Ex03_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 test = new Ex03();
		test.go();
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("===============");
		
		//Thread ó���� ���ؼ� start()�� ȣ��
		//-> ū ���� ���� ���� ������ ��� -> Thread ó�� ����.
		//why? run()���� ����������, start()�� class�ȿ� �����ϱ� ������ �켱������ start()�� ���Ե�.
		//how? Ex03 class�� �����ϴ� start()�� �����(�ּ�ó��) -> run()���� ���� Thread ó���� ��.
		System.out.println(Thread.currentThread().getName());
		test.start(); // Thread�� �ڽ� ��� ���� �� ���縦 �ΰ� �ٷ� ���� ������ ����. -> ������ �Ʒ� ������ start()�޼ҵ庸�� ������ �����.
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("===============");
		test.run();
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("===============");
	}
}
