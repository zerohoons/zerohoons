package com.ict06.Thread;

/*	Thread�� start() -> run() �� �̵��� ���δ�.
 *			 start() -> start() / run() -> run() �� �̵��� Thread�� �ƴϴ�.*/

/*	Thread ������.
 *	1)Thread class ��ӹޱ�. => start(), run() ��� ���� �ִ�.
 *	2)Runnable interface ��ӹޱ�. => run()�� �����ϰ� �ִ�. start() ����.*/
public class Ex03 extends Thread{
	
	public void go(){ //�̱�ó��. go()->go() 
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
//	@Override
//	public void start(){
//		for (int i = 1; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName()+" "+i);
//		}
//	}
	
	@Override
	public void run(){
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
