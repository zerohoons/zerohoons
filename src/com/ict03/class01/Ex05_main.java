package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		//static ��ü ������ ������� ��밡��
		//Ŭ���� �̸�. ����ʵ� / ��� �޼ҵ�
		
		System.out.println(Ex05.s3); 
		//s4�� �� �ȵǴ°�.
		//private �̱� ������ static �̾ ���� �Ұ���.
		
		Ex05 test = new Ex05();
		System.out.println(test.s1);
		System.out.println(test.s3);
		//s2�� s4���� private �̱� ������ ���� �Ұ���.
		
		test.add();
	//	test.add2();	
		//�޼ҵ� ���� private�� ������ �� ����.
		test.add3();
		//�޼ҵ带 ���� private �޼ҵ忡�� ���� �� �� ����.
	}
}
