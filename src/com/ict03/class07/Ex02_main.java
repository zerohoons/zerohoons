package com.ict03.class07;

import com.ict03.class07.Ex02.Inner01;

public class Ex02_main {
	public static void main(String[] args) {
		//Inner01 t1 = new Inner01(); ����class�� ������ ��ü�� �������� ����
		//�ܺ� class�� ���ؼ� ���� class��� ����
		
		Ex02 t1 = new Ex02();
		Ex02.Inner01 t2 = t1.new Inner01(); //�̷������� �ܺ�class�� ���ؼ� ��ü�� ����.
		//���� �� �ּҿ� $�� ������ ��, �̴� ����class��� ǥ��
		
		System.out.println(t2.name);
		System.out.println(t2.i2);
		System.out.println(t2.i4);
		t2.play();
		System.out.println();
		
	}
}
