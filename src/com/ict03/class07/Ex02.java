package com.ict03.class07;

public class Ex02 {
	String name = "ȫ�浿";
	private int age =24;
	static String addr ="���ֵ�";
	
	public Ex02() {
		System.out.println("�ܺ�Ŭ���� ������ : " + this);
	}

	public void sound() {
		int money = 1000;
		final int time = 2;
		//���������� static ���Ұ�.
		//static int numer = 12;
		//static final int number2 = 12;
		System.out.println("�ܺ�Ŭ���� �޼ҵ� : "+name + ", money :" + money);
	}
	
	public class Inner01{
		String name = "ȫ����";
		final int i2 = 10;
		//����Ŭ������ static ���Ұ�
		//static int i3 = 20;
		//�� ����ϰ� �ʹٸ�? -> Ŭ������ static���� �ٲ۴�.
		//static int i3 = 20;
		static final int i4 = 30; //-> static ����� ����
	
		public Inner01() {
			System.out.println("����Ŭ���� ������ : "+this);
		}
		
		//���� class�� �ܺ� class�� �޼ҵ�� �ʵ带 ������� ��밡��
		//����Ŭ���� �޼ҵ�
		public void play() {
			int money = 50000;
			System.out.println("name : " + name + "\rmoney : "+ money);
			System.out.println( "age : " + age);
			sound();
		}
	}
	
}
