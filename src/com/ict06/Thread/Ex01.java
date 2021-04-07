package com.ict06.Thread;

public class Ex01 {
	/* Thread ������
	 *	Thread = �ϲ� 
	 * Thread() : �⺻������
	 * Thread(Runnable target) : Runnable interface�� ���ڷ� �޾Ƽ� ó��. -> �͸� ����Ŭ������ ����� �� �ִ�.
	 * Thread(Runnable target, String name) : �� �� name�� Thread �̸����� ���� ����. Runnable interface�� ���ڷ� �޾Ƽ� ó��.
	 * Thread(String name) : �� �� name�� Thread �̸����� ������ �� �ִ�.
	 * 
	 *	�ֿ� �޼ҵ�
	 *	-join() : ���� Thread�� join()�޼ҵ带 ȣ���� Thread�� ���������� �����·� ������
	 *			  join()�� ȣ���� Thread�� ������ �ٽ� ����ȴ�.
	 *			  ��, join()�� ȣ���� Thread�� ���� ������ ������ �� ����.
	 *	-start(): start()�� �����ϸ� run()�� ȣ���Ѵ�. (����, start()�� �ִٸ� start()�� �켱���� ����.)
	 *	-run()  : start()�� ȣ���ϸ� run()�� ����ȴ�. �̸� Thread ó���� �ߴ� ��� �Ѵ�.
	 *	-sleep(long millis) : 1000�� 1�ʸ� �ǹ��ϰ�, ��� �����·� �����ִ� ���� ����.
	 *  -yield(): ���� ���� Thread �� �켱������ ���� �ٸ� Thread���� ������� �ѱ��.
	 *  -getName() : Thread�� �̸� ���ϱ�.
	 *  -setName() : Thread�� �̸� ����.
	 *  -currentThread() : ���� ����Ǵ� Thread ��ü�� �����Ѵ�. (static)*/
	
	//�տ��� ���� ��� ó���� main Thread�� ȥ�ڼ� �� ó���ϰ� �־��µ� �̸� �̱�Thread��� �Ѵ�.
	
	//���� ���ϴ� Thread�� main�ΰ� Ȯ���غ���. : JVM�� main �޼ҵ带 ȣ���ϸ� main Thread�� ������ �����Ѵ�.
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Ex02 test = new Ex02();
		System.out.println("1" + Thread.currentThread().getName());
		test.add(5,8);
		System.out.println("4" + Thread.currentThread().getName());
		int result = test.sub(8,5);
		System.out.println("7" + Thread.currentThread().getName());
		System.out.println(result);
	}
}
