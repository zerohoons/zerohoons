package com.ict01.grammar02;
class Ex05{
	public static void main(String[] args){
		//�ڷ��� : DataType : �ڹٿ��� ������ ó���� �� �����ϴ� ����
		//1. �⺻�ڷ��� : �����Ϸ��� ���ؼ� �ؼ��Ǵ� �ڷ���
		//		-> boolean, char, byte, short, long, float, double
		//2. �����ڷ��� : Ŭ������ �ڷ������� �����ϴ� �ڷ���
		// 		-> �� �� String �� �����ڷ���������, �⺻�ڷ���ó�� ����.

		String str = "Hello Java";
		System.out.println(str);

		//String + ���� : ������ ���ϱ�� ���� ������ ������ ������, ���ڸ� �����ϴ� ������ ��.
		//		 -> String���� +������ �ϴ��� ����� String
		String k1 = "1000";
		int k2 = 1000;
		System.out.println(k1+10);
		System.out.println(k2+10);

		int s1 =20;
		int s2 =4;
		System.out.println(s1 + s2);
		System.out.println("��� : "+s1 + s2); //��Ģ���� ������ ���� ��� + s1�� ���� �����ϰ� ��.
		System.out.println("��� : "+(s1 + s2)); //��ȣ�� �̿��ؼ� ���� �켱���� ����
	}
}