package com.ict01.grammar03;
class Ex05{
	public static void main(String[] args){
		//int k1�� 60 �̻��̸� �հ� �ƴϸ� ���հ�
		
		int k1 = 60;
		String pass = (k1 >= 60) ? "�հ�" : "���հ�";
		System.out.println("k1 : " + pass);
 
		//int k2�� Ȧ������ ¦������ �Ǻ�����
		
		int k2 = 3;
		String pare = ((k2 % 2) == 1) ? "Ȧ��" : "¦��";
		System.out.println("k2 : " + pare);

		//char k3�� �빮������ �ҹ������� �Ǻ�����

		char k3 = 'c';
		String big = ('a'<=k3 && k3<='z')? ("�ҹ���") : ("�빮��");
		System.out.println("k3 : "+big);
		
		//�ٹ��ð��� 8�ð������� �ð��� 8720���̰�, 8�ð��� �ʰ��� �ð���ŭ�� 1.5���̴�.
		//���� �ٹ��� �ð��� 10�ð��̴�. �󸶸� �޾ƾ��ϴ°�?

		int nom = 8720;
		int ot = (int)(nom*1.5);
		int time = 10;
		int time2 = time - 8;
		int mon = (time2 > 0) ? ((nom * (time-time2)) + (ot * time2)) : nom*time;
		System.out.println("�޿� : " + mon);

	}
}