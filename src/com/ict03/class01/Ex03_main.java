package com.ict03.class01;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		//plus01 �� void�̹Ƿ� ���� �����Ͱ� ����.
		//test.plus01(); ȣ������ ������ void�� ������ ���� �ʱ⶧����
		//				  result�� ���� �ٲ��� ����.
//		test.plus01();	//ȣ���� ���, void�� �����̵ǰ� result�� void������ ���� ���� 
//						//���ư��� ������ ���� �����.
//		System.out.println(3);
//		System.out.println(test.result);
		
		//sub01 �� ��ȯ���� int�̹Ƿ� int������ ���庯���� ������. 
		int sub = test.sub01();
		System.out.println(sub);
		
		test.plus01();	//ȣ���� ���, void�� �����̵ǰ� result�� void������ ���� ���� 
		//���ư��� ������ ���� �����.
		System.out.println(test.result);
	}
}

