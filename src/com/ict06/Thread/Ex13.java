package com.ict06.Thread;

public class Ex13 implements Runnable {
	/* �Ӱ迵�� : ��ƼThread���� �������� ���Ǵ� ����
	 * 			  ���� �������� Thread�� ���İ��� �ٸ� Thread���� ������� ���ѱ�� ���� �߻� -> ����ȭ ó���� ���� �ذ�
	 * ����ȭó�� : �Ӱ� ������ synchronized ���� ����ؼ� �̷�����.
	 * 				����� ���, ���� �������� Thread�� ���� ������ �ٸ� Thread�� �Ӱ迵���� �����ؼ� ������� ������ �� ����. 
	 */
	
	public synchronized void run() {  //synchronized �� ����ȭ ó��
		int x = 0;
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+ (++x));
		}
	}
	
}
