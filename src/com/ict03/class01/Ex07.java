package com.ict03.class01;

public class Ex07 {
	private String name = "�Ѹ�";
	private int age = 13;
	private double height = 135.15;
	private boolean gender = true;
	private char rank = 'A';
	
	//getter �Ǵ� setter ȣ���ϱ�.
		//menu -> Source -> Generate getter and setter
		//get�̸� == getter / set�̸� == setter *boolean ���� ��� getter�� get�� �ƴ� is
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; //=> this.�������� = ��������; 
		//��������(������ ����)�� ��������(���Թ��� ����)�� �̸��� ���� ��, ���������� this�� ������.
		//���������� ���������� �̸��� ���� �� �켱������ ���������̴�.
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public char getRank() {
		return rank;
	}
	public void setRank(char rank) {
		this.rank = rank;
	}
}
