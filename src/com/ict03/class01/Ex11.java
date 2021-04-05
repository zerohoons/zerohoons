package com.ict03.class01;

public class Ex11 {
/*
 ������ : Ŭ������ ��ü�� ���� ��, �ڵ����� �� �� ȣ��Ǿ�����.
 - ���� : ����ʵ�(������ ���)�� �ʱ�ȭ�� �������� �Ѵ�.
 - Ư¡ : ������ �̸��� Ŭ���� �̸��� �����ϴ�.
 		: Ŭ�����̸�(����=�Ű�����); == ������
 		: ��ȯ���� ���� �޼ҵ����� �Ѵ�.
 		: �����ڸ� ���� ������ ������ �⺻ �����ڸ� ��ü�� ����
 		  -> �⺻������ ���� �ٸ� �����ڸ� ����� ��� -> �⺻������ �Է� ����.
 		  why? �⺻�����ڰ� �ƴ� �ٸ� �����ڰ� �ڸ��� ��� �ֱ� ������.
 		  �׷��� ������ �ٸ� �����ڷ� ��ü ������ �����ؾ� �Ѵ�.
 		: �⺻ �����ڶ� ���ڰ� ���� �����ڸ� ���Ѵ�.
 		  -> Ŭ�����̸� () == �⺻ ������
 		: ������ ���� �����ε��� �����ϴ�.
 		  -> �׷��⿡ �ϳ��� Ŭ������ �������� �����ڰ� ������ �� �ִ�.
 		  -> �����ε��� ���, ������ ������ ����, ������ �޶���Ѵ�.
 		  *�����ε�? �ϳ��� Ŭ���� �ȿ� ���� �̸��� �޼ҵ尡 ������ �����ϴ� ���.
 		  *��, �޼ҵ��� ����, ����, ������ �ٸ���.
 		: Ŭ���� �ȿ��� �����ڸ� ���� ���, ������� �����ڸ� ����ؾ��Ѵ�.
 */
	
	private String name = "�Ѹ�";
	private int age = 24;
	private boolean gender = true;
	//������ �����ε� - �⺻������, ���� ������ 2�� ���� ��������
	//���� ���̳� ��ġ, ������ �ٸ��� ������ ���� �ٸ� �����ڷ� �ν�
	
	//�⺻������ - ����ʵ带 �ʱ�ȭ ��Ų��. -> ������ �� �Է� ������ 1����.
	public Ex11() { //ctr+spacebar -> constructor
		System.out.println("�⺻������");
		name = "�±Ǻ���";
		age = 43;
		gender = false;
	}
	
	//�⺻�����ڰ� �ƴ� ���. (���ڰ� �ִ� ������)
	//�������� ������ ����
//	public Ex11(String name, int age) { 
//		//���Ӱ� �Էµ� ��. ���� private �� ���ڵ���� �ٸ�.
//		//���Խ����ֱ� ���ؼ���
//		this.name = name;
//		this.age = age;
//		
//	}
	public Ex11(String name, int age) {
		System.out.println(1);
		this.name = name;
		this.age = age;
	}
	public Ex11( int age, String name) {
	//������ ������ �ٲٴ� �͸����ε� �����ڴ� �޶���.
		System.out.println(2);
		this.name = name;
		this.age = age;
	}
	//getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}