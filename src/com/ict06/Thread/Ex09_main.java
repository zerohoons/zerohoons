package com.ict06.Thread;

public class Ex09_main {
	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		//t1.start() : Runnable interface �� start()�� ����
		
		//������ run()�޼ҵ带 ���� class, ��. Ÿ���� �����ؾ��Ѵ�.
		// -> Thread Thread1 = new Thread(); �⺻ �����ڴ� Ÿ���� ��� �Ұ���.
		Thread thread1 = new Thread(t1); //Ÿ�� ���ڸ� ����.
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		//�ȵ���̵忡�� �ַ� ���� ��� - �͸� ���� Ŭ����
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName()+"������������������");					
				}
			}
		}).start();
		
	}
}
