package com.ict01.grammar03;
import java.util.Scanner;
class Ex08 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	//���ڸ� �޾Ƽ� Ȧ��, ¦���� ��������.
	System.out.println("� ���ڿ�? ");
	int q1 = sc.nextInt();
	String ans1 = ((q1 % 2) == 1) ? "Ȧ���Դϴ�.": "¦���Դϴ�.";
	System.out.println(ans1); 
	
	//����, ����, ������ �޾Ƽ� ������ ����� 60�̻��̸� ���� ������ 40�� ������ �հ� �ƴϸ� ���հ�
	System.out.println("���� ���� : ");
	int kor = sc.nextInt();
	System.out.println("���� ���� : ");
	int eng = sc.nextInt();
	System.out.println("���� ���� : ");
	int mat = sc.nextInt();
	
	Double ave = (kor+eng+mat)/3.0;
	String ans2 = (kor>= 40 && eng>= 40&& mat>= 40)? (ave >=60) ? "�հ��Դϴ�." : "���հ��Դϴ�." : "���հ��Դϴ�.";
	System.out.println(ans2); 

	//�˹ٽð��� �Է¹޾Ƽ� 8�ð������� �ð��� 8720, �ʰ��ϸ� 1.5�� �˹ٽð��� �Է¹ް� �ñ��� �������.

	System.out.println("�ٹ��ð��� �˷��ּ���.");
	double hour = sc.nextDouble();
	int pay = 8720;
	double ot = (hour > 8)? (hour - 8) : 0;
	int ans3 = (int)(pay*(hour - ot) + (ot*pay*1.5));
	System.out.println("�� "+ans3 + "�� �Դϴ�.");
	}
}