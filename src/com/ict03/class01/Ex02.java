package com.ict03.class01;

public class Ex02 {
		//Ŭ���� �ȿ��� 3������ �����Ѵ�.
		//����ʵ�, ����޼ҵ�, ������
		
		//����ʵ� : ����� ����, static�� instance�� ��������.
		//static�� ������ �ν��Ͻ� (��ü ������ �� ���� ���������.)
		//static�̶� ��ü ������ ������� �̸� ���������.
	
		int k1 = 80;				//�ν���Ʈ ����
		static int k2 = 90;			//static ����
		final int K3 = 85;			//�ν���Ʈ ��� (final�� ������ ���)
		static final int K4 = 95;	//static ���
		//�޼ҵ� �ۿ����� System.out.println(); ���Ұ���
		
		//������� final�� �ٴ´�!! - ����� �ѹ� ������ ���� ������ �� ����.
		//����޼ҵ� : ����, ���
		// => �޼ҵ�� �ڱ⸦ ȣ���� ������ �ݵ��! �ǵ��� ����.
		//void �� ��ȯ���� ������ �˷��ش�!!
		public void prn01(){ 				//�ν��Ͻ�, ��ȯ���� ���� �޼ҵ�
			k1 = k1 +20;
			k2 = k2 +15;
			System.out.println("k1 : " + k1);
			System.out.println("k2 : " + k2);
			//K3 = k3+15; K4 = K5+5; K3, K4�� ����̱� ������ �������� �Ұ� -> �����߻�

			//�������� : �޼ҵ� �ȿ��� ������� ����
			//		     �޼ҵ� �ȿ��� ������� ������ �޼ҵ带 ȣ���� �� �����ȴ�.
			//			 �޼ҵ尡 ������ �������.
			//			 ���������� static ������ ���� �� ����.
			int s1 = 10;
			final int s2 = 20;
			//static int s3 = 30; static final int s4 = 40; ���������� static ������ ���� �� ����.
			
			s1 = s1+20;
			
			
		}
		
		public static void prn02() {	//static, ��ȯ���� ���� �޼ҵ�
			//k1 = k1 +20; K3 = k3+15; static �޼ҵ忡���� instance ������ ����� �� ����.
			k2 = k2 +15;  
			System.out.println("K4 : " + K4); //static �޼ҵ忡�� static ������� ���� �ٲ� �� ����. 
			
			int s1 = 10;
			final int s2 = 20;
			
			//static int s3 = 30; static final int s4 = 40; 
			//static �޼ҵ�� �ϴ���, ���������� static ������ ���� �� ����.
			
			return;
		}
		
		//��ȯ���� �ڷᰪ���� ���ų� ���� �ڷ����� ���� �� ����.
		public int prn03() { return 'c'; }	 			//�ν��Ͻ�, ��ȯ�� �ִ� �޼ҵ�, ������ �� return '����������'
		//=> ��ȯ�� �ڷ��� : int, �� �� char
		public static double prn04() {return 147; }	//static, ��ȯ�� �ִ� �޼ҵ�
		//=> ��ȯ�� �ڷ��� : double, �� �� : int
}
