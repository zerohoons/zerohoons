package com.ict03.class04;

//�Ϲ� Ŭ������ �߻�Ŭ������ ����� �� �ݵ�� �߻�Ŭ������ �߻�޼ҵ带 �������̵� �ؾ��Ѵ�.
public class Ex02 extends Ex01 {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
}

//�������̵��� ���� �ʴ� ���
//1) �ڽ� Ŭ������ abstract Ŭ������ �����.
//	-> �θ��� �߻�޼ҵ带 ��üȭ ���� ����.

abstract class Ex03 extends Ex01{
	public void song() {
		
	}
}

//2) �ڽ�Ŭ������ �߻�޼ҵ带 �����.
//	->�θ��� �߻�޼ҵ带 ��üȭ ���� ����.
abstract class Ex04 extends Ex01{
	public void Music() {
		System.out.println("����");
	}
	public abstract void Pop();
}
