package com.ict01.grammar02;
class Ex09{
	public static void main(String[] args){
	
	int sec = 23;
	int hour = 2;
	int min = 40;
	hour = hour*60;
	min =(min+hour)*60;
	sec = min +sec;
	System.out.println("2�ð� 40�� 23�ʴ� "+sec+" �� �̴�.");

	sec = 9630 % 60; //��
	int min1 = 9630 / 60; //��(���v�׷���)
	min = min1 % 60; //��
	hour = min1 / 60; //�ð�
	System.out.println(hour+" �ð� "+min+" �� "+sec+" ��");
	
	
	}
}	
// 2�ð� 40�� 23�ʸ� �ʴ����� �����ض�.
	
	//9630�ʴ� ��ð� ��� �����ΰ�.