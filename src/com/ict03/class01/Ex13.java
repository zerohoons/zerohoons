package com.ict03.class01;

public class Ex13 {
	private String name = "�����";
	private int age = 3;
	private String addr = "����";
	
	//������ �����ε�
	//�⺻ ������ ctrl + spacebar
	
	public Ex13() {
		/* this : ��ü ���ο��� ��ü �ڽ��� ��Ī�ϴ� �����
		 * this.���� : ��������
		 * this.() : �����ڰ� �����ڸ� ȣ���� �� ����ϴ� �����. �ݵ�� ������ ù�ٿ��� ��밡��*/
		//this("������", 21, "����");
		System.out.println("�⺻������ : " + this);
		//System.out.println(this.name);
		//System.out.println(this.getName());
	}
	
	//source �޴�
	public Ex13(String name, int age) {
		
	}
}
