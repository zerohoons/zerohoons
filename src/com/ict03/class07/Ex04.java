package com.ict03.class07;

public class Ex04 {

		String name = "ȫ�浿";
		private static int age =24;
		static String addr ="���ֵ�";
		
		public Ex04() {
			System.out.println("�ܺ�Ŭ���� ������ : " + this);
		}

//		public void sound() {
//			int money = 1000;
//			final int time = 2;
//			//���������� static ���Ұ�.
//			//static int numer = 12;
//			//static final int number2 = 12;
//			System.out.println("�ܺ�Ŭ���� �޼ҵ� : "+name + ", money :" + money);
//		}
		
		public static class Inner03{
			String name = "ȫ����";
			final int i2 = 10;
			//����Ŭ������ static ���Ұ�
			//static int i3 = 20;
			//�� ����ϰ� �ʹٸ�? -> Ŭ������ static���� �ٲ۴�.
			static int i3 = 20;
			static final int i4 = 30; //-> static ����� ����
		
			public Inner03() {
				System.out.println("����Ŭ���� ������ : "+this);
			}
			
			//���� class�� �ܺ� class�� �޼ҵ�� �ʵ带 ������� ��밡��
			//����Ŭ���� �޼ҵ�
			public void play() {
				int money = 50000;
				System.out.println("name : " + name + "\rmoney : "+ money);
				//�ܺ� Ŭ������ �ʵ� static�� �ٿ��� ��� ����
				System.out.println( "age : " + age);
				//�ܺ� Ŭ������ �޼ҵ嵵 static�� �ٿ�����.
//				sound();
			}
		}
		
	}


