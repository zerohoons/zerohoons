package com.ict01.grammar02;
class Ex07{
	public static void main(String[] args){
	//�̸��� ȫ�浿�� ����� ���� 90, ���� 80, ���� 90�̴�.
	// ������ ����� ���Ͻÿ� (����� �Ҽ��� ù°�ڸ����� ���Ѵ�.)
	// ���ϴ� ������ �ޱ� : �Է�
	
	String name = "ȫ�浿";
	int hk = 90;
	int he = 80;
	int hm = 90;
	
	int sum = hk+he+hm;
	double ave = (double)(sum)/3.0;
	ave = (int)(ave*10);
	ave = ave/10.0;
	System.out.println("�̸� : " + name);
	System.out.println("���� : " + sum);
	System.out.println("��� : " + ave);
	
	
 	}
}