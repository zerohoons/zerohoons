package com.ict01.grammar03;
class Ex04{
	public static void main(String[] args){
		//���� ������ ( ���ǿ����� = if~else���� ����.)
		// ���庯�� = ���ǽ� ? ���϶� ������ ����; �����϶� ������ ����
		// ���ǽĿ��� boolean, ������, �񱳿����� ����.
		// ���庯��, ���϶� ���๮��, �����϶� ���� ������ ���� ���� ������ Ÿ���̾���Ѵ�.
		// (��, ���庯���� �ٸ� �� �ڷ��� ���� �� ū �ڷ����̸� ��������.)
		// byte < short < char < int < long < float < double ;

		int result = true ? 14 : 10;
		System.out.println("��� : " + result);
		
		result = false ? 14 : 10;
		System.out.println("��� : " + result);

		int result2 = false ? 14 : 'C';
		System.out.println("��� : " + result2);
		System.out.println("��� : " + (char)(result2));

		//�־��� sum�� 80 �̻��̸� �հ�, ���а�
		int sum = 81;
		String result3 = (sum >= 80) ? "�հ�" : "���հ�";
		System.out.println("��� : " + result3 );

		double avg = 87.0 ;
		double result4 = (avg >= 90) ? 'A' : 'B';
		System.out.println("��� : " + (char)(result4));
	}
}