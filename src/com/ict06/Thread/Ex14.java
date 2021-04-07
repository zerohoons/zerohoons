package com.ict06.Thread;
/*	wait() : ����ȭ ó���� �� ��, ���� ���� Thread�� ������ �����·� ���� �޼ҵ� -> notify()���� ������ �����·� ���α׷� ����.
 *	notify() : wait() ������ Thread�� �����ִ� �޼ҵ�  
 *	notifyAll() : ��� wait() ������ Thread�� ����� �޼ҵ� */
public class Ex14 implements Runnable {
	int x = 0;
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+ " : "+ (++x));
			
			if(x==25) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
	}
}
