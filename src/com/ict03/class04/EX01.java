package com.ict03.class04;

public abstract class Ex01 { //�߻�޼ҵ带 ���ϰ� �ֱ� ������ Ŭ���� ���� abstract!
	/* �߻� Ŭ���� : �� �� �̻��� �߻�޼ҵ带 ������ �ִ� Ŭ������ �߻�Ŭ������� �Ѵ�.
	 * 				-> �Ϲ����� �޼ҵ�� �ʵ带 ���� �� �ִ�.
	 * 				-> �߻�Ŭ������ abstract ���� ����Ѵ�. */
	
	/* �߻� �޼ҵ� : ��üȭ�� ���� ���� �޼ҵ带 �ǹ��Ѵ�.
	 * 				-> body����� �������� �ʴ� �޼ҵ��̴�. => ���๮�� ������ �ʾ����� �ǹ���. => ��üȭ�� ���� ����.
	 * 				-> �ݵ�� abstract ���� ����Ѵ�. */
	
	/* ������	   : �ϳ��� �޼ҵ峪 Ŭ������ ������ ��, �پ��� ������� ���۽�Ű�� ���� �ǹ��Ѵ�. */
	
	int s1 = 10;
	static int s2 = 10;
	final int s3 = 10;
	static final int s4 = 10;
	
	public void play() {
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}
	public static void prn() {
		System.out.println("static �޼ҵ�");
	}
	
	//�߻�޼ҵ�
	public abstract void sound(); //�ٵ� �������� ���� -> {}�� ����
}
