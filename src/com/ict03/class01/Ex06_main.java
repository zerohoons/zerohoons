package com.ict03.class01;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 test = new Ex06();
		//System.out.println(t.name); // name�� private�̱� ������ ����
	
		//private �� ������ �޼ҵ带 �̿��ؼ� �ҷ���
		//�� ���� �޼ҵ带 getter �޼ҵ��� �θ�
	
		String name = test.namae();
		int age = test.tosi();
		double height = test.sei();
		char rank = test.tani();
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println(" Ű  : "+height);
		System.out.println("���� : "+(char)(rank));
		
		//private �޼ҵ�� ������ �Ұ����ϴ�.
		//�̶� �ٸ� �޼ҵ带 �̿��ؼ� �̸� ���� �ϴµ�, �� �޼ҵ带 setter �޼ҵ�� �θ�.
		test.m1("��浿");
		test.m2(55);
		test.m3(176.8);
		test.m4('B');
		
		name = test.namae();
		age = test.tosi();
		height = test.sei();
		rank = test.tani();
		
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println(" Ű  : "+height);
		System.out.println("���� : "+(char)(rank));
		
	
	}
}