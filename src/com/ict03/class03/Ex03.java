package com.ict03.class03;

//extends Ex02�� �Է������μ�, �� ���� ��Ӱ���� ������. -> �ڽĸ� �θ� �̿��� �� ����.
public class Ex03 extends Ex02{
	String name = "���θ�";
	int age = 34;
	static String hobby = "��ȭ����";
	
	public Ex03() {
		System.out.println("�ڽ�Ŭ���� ������" +this);
	}
	
	public void sound() {
		System.out.println("�ڽ�Ŭ���� �޼ҵ�");
	}
	
	public void study() {
		System.out.println("���� ��� : " +addr );
		System.out.println("�츮�� �ֿϵ��� : " + dog); //��Ӱ��迩�� private �� ���Ұ�
		System.out.println("name : " +this.name); //this�� ���û���.
		System.out.println("name : " +super.name ); //���� �̸� ���� �� ���� ��� �θ� Ŭ���� ���� ȣ�� �Ҷ��� super
	}
	
	//�������̵� - �θ�޼ҵ��� �Ѹ���� �״�� ����ϸ鼭 ���븸 �����ϴ� ��.
	@Override
	public void poppy() {
		System.out.println("�θ� �޼ҵ带 �״�� �ҷ��ͼ� ������ ���� �ٲ۴�. == �������̵�.");
	}
	
//	public final void walk() { 
//		System.out.println("�Ϸ翡 ������ 1�ð��� �ɾ�ٴѴ�.");
//	} -> final�� ���� �͵��� �������̵��� �Ұ����ϴ�.
	// �θ�޼ҵ忡 final�� ������ override �� �� ����.
	
}
