package com.ict06.Thread;
/* ���� 2) Ex15�Ļ�����
 * �� ���� Thread�� �����Ͽ�, ù��°�� ����� 1-50����.
 * �ι�°�� ����� 51-100. �ٽ� ù��°�� 101���� 150���� ���.
 * �ι�°�� 151���� 200���� ���. (synchronized / wait / notify �̿�)*/
public class Ex16 implements Runnable{
	
	int x = 0;
	
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ (++x));
			if((x % 50) == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				notify();
			}
		}
	}
}
