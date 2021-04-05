package com.ict01.grammar02;
class Ex04{
	public static void main(String[] args){
		// ���� ũ�⿡ ���� �������.
		// char<int<long<float<double;
		//(����) (������) (�Ǽ���)
		// ����ȯ : �ڵ� ��ȯ/ ������ ��ȯ
		// �ڵ��� ��ȯ : ���� �ڷ����� ū �ڷ����� ���� �� �� �̷���. = ���θ��
		// char �� int�� ������ �� �ִ�.
		char c1 = 'a';
		System.out.println(c1);
		int s1 = 'a';
		System.out.println(s1);
		int s2 = c1; //���� c1�� ���� �Ǵ� ���� �ƴ�, c1�� �������� a�� ������ ��
		System.out.println(s2);
		
		//int�� long�� ������ �� �ִ�.
		long l1 = s1;
		System.out.println(l1);
		
		//long�� float / double �� ������ �� �ִ�.
		float f1 = l1;
		System.out.println(f1);
		// ������ ��ȯ : ū �ڷ����� ���� �ڷ������� ���� �� �� ��Ÿ���� ������ ���ְ� ������ ��ȯ�ϴ� ��. 
		//		�׷��⿡ �����ս��� �߻��Ѵ�. = ����
		// =�� �������� ������ �����ڷ����� �����. =(�����ڷ���)(���)
		
		// byte b1 = 128; �����߻�. ����ȯ �ʿ�
		 byte b1 = (byte)(128); //���� ����ȯ -> byte �������� �ٲ� 128-> -128
		b1 = (byte)(129); // -127 ���� why? 127�� ���̾��� ������ ���� ���� �� -128�� ���ư��� �ٽ� ���� ��. 
		System.out.println(b1);

		//int�� char �� �ֱ�
		char c2 = 97; //���� �ƴ�. char�� ���ڿ��� ���� �ҷ����� ������
		System.out.println(c2);
		
		int s3 = 97;
		// char c3 = s3; ����. char���� ū int��(s3)�� char�� ���� �� ����.
		char c3 = (char)(s3); // ���� ����ȯ
		System.out.println(c3);

		//float / double �� int �� ����
		//int k5 = 87.64; -> ���� �߻� int�� double ���� ������.
		int k5 = (int)(87.64); //87 ��� 0.64�� ���� �ս�.
		System.out.println(k5);

		//�Ҽ��� ù°���� ������.
		System.out.println(k5/10); // �Ҽ��� ����.
		System.out.println(k5/10.0); //�Ҽ��� ����.
		
		//1�� �ڸ� ����
		int k6 =230415;
		k6 = k6/10;
		k6 = k6*10;
		System.out.println(k6);

	}
}