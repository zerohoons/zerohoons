package com.ict01.grammar02;
class Ex06{
	public static void main(String[] args){
	// ��������� ; +, -, *, /, %(������)
	// byte < short < char < int < long < float < double
	// ���� �ڷ����� ū �ڷ����� �����ϸ� ū �ڷ������� ����.
	// int + int = int, long + long = long, float + float = float
	// ����) byte + byte = byte(X) int
	// 	 short + short = short(X) int
	//	 byte + short = short(X) int

	// ������ ����
	int k1 = 21755;
	int s1 = k1 /10;
	int s2 = s1*10;
	int s5 = (k1/10)*10;
	System.out.println(s2);
	System.out.println(s5);
	// �Ҽ��� ù°�ڸ����� ���ϱ�.
	double k2 = 24.6843;
	int s3 = (int)(k2*10);
	int s4 = (int)(s3/10.0);
	int s6 = (int)((k2*10)/10.0); // int �̱� ������ �Ҽ��� ù°�ڸ� ����. 
	double s7 = s3 / 10.0; // �Ҽ��� ù°�ڸ��� ���ϱ� ���� �����͸� double�� ����.
	System.out.println(s4);
	System.out.println(s6);
	System.out.println(s7);

	// % �� ���� ��������, /�� ���� ����� �����ϸ�, int ���� /�� ���̴�.
	int su1 = 7;
	int su2 = 3;
	int res1 = 7/3;
	int res2 = 7%3;
	System.out.println(res1);
	System.out.println(res2);
	
	//����� 2�� ���� �������� 1�� ������ Ȧ��
	//����� 2�� ���� �������� 0�� ������ ¦��
	}
}