package com.ict03.class03;

public class Ex02 {
	String name =  "������";
	int age = 57;
	String addr = "����";
	/*private*/ String dog = "�����"; //��Ӱ��迩�� private �� ���Ұ�
	static int car = 2;
	
	public Ex02() {
		System.out.println("�θ�Ŭ���� ������" + this);
	}
	
	public void prn() {
		System.out.println("�θ�Ŭ���� �޼ҵ�");
	}
	
	public static void play() {
		System.out.println("�θ� Ŭ���� static �޼ҵ�");
	}
	
	public void poppy() {
		System.out.println("�۸�");
	}
	
	public final void walk() { //final ~ ��������~ -> �ڽ�Ŭ�������� ������ �� ����.
		System.out.println("�Ϸ翡 ������ 1�ð��� �ɾ�ٴѴ�.");
	}
}
