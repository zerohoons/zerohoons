package com.ict06.Thread;

public class Ex06_main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex04 t1 = new Ex04();
		Ex05 t2 = new Ex05();
		Ex06 t3 = new Ex06();

		//Thread ó�� -> ����ó���� ����.
		t1.start();
		t2.start();
		t3.start();
	}
}
