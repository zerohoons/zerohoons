package com.ict06.Thread;
/*Thread ����.
- �ΰ��� Thread�� �����Ͽ�, ù��°�� ����� 1-100.
  �ι�°�� ����� 101-200���� ����϶�. (synchronized ���)
*/
public class Ex15 implements Runnable{
	int x = 0;
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+ (++x));
		}
	}
}
