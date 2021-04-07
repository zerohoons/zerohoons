package com.ict06.Thread;

//���� ������ : �Ϲ� Thread�� �۾��� ���� �������� ������ �����ϴ� Thread
//				�Ϲ� Thread�� ����Ǹ� ���� Thread�� ���������� �����.
public class Ex11_main {
	public static void main(String[] args) {
		//���� Thread �����. Daemon Thread
		System.out.println(Thread.currentThread().getName()+ " ����");
		Ex10 t1 = new Ex10();
		Ex11 t2 = new Ex11();
		
		Thread thread1 = new Thread(t1);
		thread1.setDaemon(true); // ���� Thread ����
		thread1.start();
		
		//new Thread(t2).start(); �� ���Ŀ��� ���� Thread ���� �Ұ���.
		Thread thread2 = new Thread(t2);
		thread2.setDaemon(true); // ���� Thread ����
		thread2.start();
		
		
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName()+" " + i);
		}
		System.out.println(Thread.currentThread().getName()+ " ��");
		
		//�Ϲ� Thread���� �����δ� ����, ���� ���������� �۵��� �Ǿ����� ���� ��ó�� �ӵ��� Ȯ�� �Ұ���
		//Daemon Thread�� ��� main�� ������ Thread�� ����Ǳ� ������ Ȯ�� ����.
	}
}
