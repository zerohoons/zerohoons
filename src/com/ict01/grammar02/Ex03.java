package com.ict01.grammar02;
class Ex03{
	public static void main(String[] args){
		//������ : �Ҽ����� ���� ����. - byte<short<int<long
		//�������� �⺻ ���� int
		//byte, short�� �����ϸ� ����� ������ int �̻�.

		//byte = -128 ~ 127 ������ ������ �̿밡��
		byte b = -128;
		System.out.println(b);
		b = -129+3; //�̿� ���� ������ �Ѿ�� ������ ��
		System.out.println(b);

		//short = -32,768 ~ 32,767 ������ ������ ����
		//short s = 32760 + 100; ���� �� ���� short�� ���� �Ѿ�� ������ �����߻�
		short s = 32767;
		System.out.println(s);
		
		//int/long = ������ ������ �ֱ� ������, �ܿ� �ʿ�� ����.
		//�Ϲ����� ������ int�� �̿�. ��, ���� ū ������ �̿��� ��� long�� ����Ѵ�.
		//long �� ���� �ڿ� L/l �� ����� �� �ֱ� ������ (������ ����)
		int i =117;
		long l1 = 117L;
		long l2 = 117l;
		long l3 = 117;
		System.out.println(i);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);

		double d1 =3.14;
		System.out.println(d1);
		double d2 = 117; //�ڷ��� ���·� ���������� ����������, �� ��ȯ���� ���� ������ �ƴ�.
		System.out.println(d2);

		//�Ǽ� = ��� ��. �Ҽ��� ����. �������� ������ ũ�� (ũ�Ⱑ �ƴ�, ǥ�� ���� ����)
		//float�� ���� �ڿ� F/f�� ���δ�. ��, ���� �Ұ���. �ݵ�� ǥ���� ��!
		//����(byte<short)<char<����(int<long)<�Ǽ�(float < double
		//float f =3.14; f �������� ���� ���� �߻�
		float f = 3.14f; //f�� ��µ��� ����
		System.out.println(f);
	
		
	}
}