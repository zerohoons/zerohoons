package com.ict03.class07;

public class Ex03_main {
	public static void main(String[] args) {
		// 	���� class�� ������ ��ü������ �� �� ����.
//		 	Inner02 t1 = new Inner02();
		
// �޼ҵ� �ȿ� �ֱ� ������ class �� ���� class ó�� ��ü ���� �Ұ���
		Ex03 t1 =new Ex03();
//		Ex03.Inner02 t2 = t1.new Inner02();
		
// ����Ŭ������ �����ϴ� �޼ҵ带 �����ؾ߸� ����Ŭ������ ���� �� �ִ�.
		t1.play();
		
// ����Ŭ������ ���� ����Ŭ������ ���Ѹ޼ҵ��� �� ���̿��� 
// ��ü�� �����ϰ� �����ؾ��Ѵ�.
	}
}
