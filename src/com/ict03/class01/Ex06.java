package com.ict03.class01;

public class Ex06 {
	private String name = "ȫ�浿";
	private int age = 24;
	private double height = 180.3;
	private char rank = 'A';
	
	//private ������ �����ϱ� ���ؼ��� �޼ҵ带 �������.
	//�̸� �����ֱ� ( getter �޼ҵ� )
	public String namae() {
		return name;		
	}
	public int tosi() {
		return age;		
	}
	public double sei() {
		return height;		
	}
	public char tani() {
		return rank;		
	}
	
	//������ �����ؼ� �ش� ������ �����͸� �����Ҷ� ����ϴ� �޼ҵ�
	//setter �޼ҵ�
	
	public void m1(String t1) {
		name = t1;
	}
	public void m2(int t1) {
		age = t1;
	}
	public void m3(double t1) {
		height = t1;
	}
	public void m4(char t1) {
		rank = t1;
	}
}
