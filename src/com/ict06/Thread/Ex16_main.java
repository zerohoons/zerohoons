package com.ict06.Thread;
/* ���� 2) Ex15�Ļ�����
 * �� ���� Thread�� �����Ͽ�, ù��°�� ����� 1-50����.
 * �ι�°�� ����� 51-100. �ٽ� ù��°�� 101���� 150���� ���.
 * �ι�°�� 151���� 200���� ���. (synchronized / wait / notify �̿�)*/
public class Ex16_main {
	public static void main(String[] args) {
		Ex16 t1 = new Ex16();
		
		new Thread(t1,"�ϳ�").start();
		new Thread(t1,"��").start();
		
	}
}
