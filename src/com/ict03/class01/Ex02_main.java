package com.ict03.class01;

public class Ex02_main {
	public static void main(String[] args) {
		
//		System.out.println(test); 	// �ּ�
//		System.out.println(test.k1);
//		System.out.println(test.k2);
//		System.out.println(test.K3);
//		System.out.println(test.K4);
//		test Ŭ������ ����� ���̱� ������ ����.
		
		//static�� ��ü ������ ������� �̸� ���������.
		//ȣ���ϴ� ��� : Ŭ�����̸�.static �޼ҵ�/ ����
		//System.out.println(Ex02.k1); instance �� ���, �����߻�!
		System.out.println(Ex02.k2);
		//System.out.println(Ex02.K3);
		System.out.println(Ex02.K4);
		
		//void�� ���, ������ �Ѿ���� ����.
		Ex02.prn02();
		//void�� �ƴ� ���, ��ȯ���� ���缭 ��������.
		double su1 = Ex02.prn04();
		System.out.println(su1);
		
		System.out.println("===============��ü��������================");
	//1. Ex02 Ŭ������ ����ϱ� ���ؼ� Ŭ������ ��ü�� ������.
	//	Ŭ���� ����� ���
	//	Ŭ���� �������� = new ������;
	//	�����ڰ� ���� ��� �⺻ ������ == Ŭ�����̸�()
		Ex02 test = new Ex02();
	//	Ex02 Ŭ������ ��� �����ڰ� �������� ����. -> �⺻������ �̿�.
		System.out.println(test); 	// �ּ�
		System.out.println(test.k1);
		System.out.println(test.k2);
		System.out.println(test.K3);
		System.out.println(test.K4);
	
	//�޼ҵ� ����
		//static �� ��� ���������� �ƴ� Ŭ���������� �����̰����ϴ�.
		//�����ϱ� ���� �ϱ����� static�� Ŭ������ ������ ��õ!
		test.prn01();
		test.prn02();
		Ex02.prn02();
		int su2 = test.prn03();
		System.out.println(su2);
		double su3 = Ex02.prn04(); //static�̴ϱ� class ������ ����.
		System.out.println(su3);
	}
}
