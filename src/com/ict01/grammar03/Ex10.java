package com.ict01.grammar03;
import java.util.Scanner;
class Ex10{
	public static void main(String[] args){
	//if ~ else ~ : ���ǽ��� ���϶��� �����϶� ���� ������ ó���Ѵ� = ���׿����� =?:
	//���� : if(���ǽ�){ ���ǽ��� ���� �� ������ ���� } else { ���ǽ��� ������ �� ������ ����}
	Scanner sc = new Scanner(System.in);
	//int k1 �� 60 �̻��̸� �հ� �ƴϸ� ���հ�

	int k1 = 60;
	String ans = " ";
	if (k1<=60){
		ans = "���հ�";
	} else {
	ans = "�հ�";
	}
	System.out.println(ans);

	//int k2 �� Ȧ������ ¦������ �Ǻ�����
	
	int k2 = 3;
	String ans2 = " ";
	if((k2 % 2)==0) {
		ans2 = "¦��";
	}else {
	ans2 = "Ȧ��";
	}
	System.out.println(ans2);
	

	//char k3 �� �빮������ �빮�ڰ� �ƴ���

	char k3 = 'D';
	String ans3 = " ";
	if(k3<='A' || k3>='Z'){
	ans3 = "�빮�ڰ� �ƴ�";
	}else {
	ans3 = "�빮��";
	}
	System.out.println(ans3);

	//k4�� 1�Ǵ� 3�̸� ���� �ƴϸ� ����
	
	int k4 = 2;
	String ans4 = " ";
	if (k4 == 2 || k4 == 4){
	ans4 = "����";
	}else {
	ans3 = "����";
	}
	System.out.println(ans4);
	
	//�ٹ��ð� 8�ð������� �ð��� 8720, �ʰ��ϸ� 1.5��. ���� 10�ð� �ٹ�. �����ݾ� ��?
	
	double time = 10;
	double pay = 8720;
	int sum = 0;
	
	if (time > 8) {
	sum = (int)(((time-8)*(pay*1.5)) + (pay*8));
	}else {
	sum = (int)(pay*time);
	}
	System.out.println(sum);
	
	}	
}