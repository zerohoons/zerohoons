package com.ict03.class07;

/*
 * 
 */
public class Ex03 {
	String name = "�Ѹ�";
	int hight = 160;
	public Ex03() {
		System.out.println("�ܺ� : " + this);
	}
	
	public void sound() {
		String addr = "����";
		System.out.println("ȣ��~ ȣ��~");
	}
	//����Ŭ������ ���� �޼ҵ�
	public void play() {
		int age = 24;
		class Inner02{ //�޼ҵ� �� ����Ŭ���� public ��� �Ұ�
			String name = "����";
			int age = 5;
			public Inner02() {
				System.out.println("���� : "+this);
			}
			public void hobby() {
				System.out.println(name);
				System.out.println(hight);
				//System.out.println(addr); �ڽ��� ���� �޼ҵ尡 �ƴϸ� ����� �� ����.
				System.out.println(age);
			}
		} //���� Ŭ���� ��
	Inner02 in02 = new Inner02(); //�ܺθ��
	System.out.println(name); //�ܺ� �޼ҵ�
	sound();
	in02.hobby();
	} //�ܺ� �޼ҵ� ��
}
