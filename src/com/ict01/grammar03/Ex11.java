package com.ict01.grammar03;
class Ex11 {
	public static void main(String[] args){
	// ���� if �� : ���ǽ��� ������ �� �ٽ� ���ǽ��� ����Ѵ�.
	// if (���ǽ� 1) {
	//	���ǽ� 1�� ���϶� ����;
	//}else if (���ǽ� 2){
	//	���ǽ� 1�� ����, but ���ǽ� 2�� ���� �� ����;
	//}else if (���ǽ� 3){
	//	���ǽ� 1, 2�� ����, but ���ǽ� 3�� ���϶� ����;
	//}else{
	//���ǽ��� ���� ������ �� ����;
	//}

	// int k1 �� ������ 90 �̻��̸� a 80�̻��� b 70�̻��� c �������� f
		int k1 = 90;
		String ans = "A";
		if(k1>=90){
		ans = "A";
		} else if (k1>=80) {
		ans = "B";
		} else if (k1 >=70) {
		ans = "C";
		} else {
		ans = "F";
		}
		System.out.println(ans);

	// char k2 �� �빮�� �ҹ��� ���� ��Ÿ�������� �Ǻ�

		char k2 = '3';
		String ans2 = " ";
		if (k2>='0' && k2 <='9') {
		ans2 = "����";
		} else if(k2>='a' && k2 <='z'){
		ans2 = "�ҹ���";
		} else if(k2>='A' && k2 <='Z'){
		ans2 = "�빮��";
		}else {
		ans2 = "��Ÿ����";
		}
		System.out.println(ans2);

	// char k3�� A,a�̸� ������ī B,b�� ����� C,c�� ĳ���� �������ѱ�
	
		char k3 = 'a';
		String ans3 = " ";
		if(k3 == 'a'||k3 == 'A'){
		ans3 = "������ī";
		} else if (k3 == 'b' || k3 == 'B'){
		ans3 = "�����";
		} else if (k3 == 'c' || k3 == 'C'){
		ans3 = "ĳ����";
		}else {
		ans3 = "�ѱ�";
		}
		System.out.println(ans3);	

	// menu�� 1�̸� ī���ī 3500, 2�̸� �� 4000�� 3�̸� �Ƹ޸�ī�� 3000 4�� �����ֽ� 3500��
	// ģ���� 2���� �������� �Ծ���. �ܵ��� ��?

		int menu = 3;
		int change = 0;
		int how = 2;
		int moca = 3500;
		int late = 4000;
		int ame = 3000;
		int fruit = 3500;
		double tax = 1.10;
		if (menu == 1){
		change = 10000 - (int)(tax*(how*moca));
		} else if (menu == 2){
		change = 10000 - (int)(tax*(how*late));
		} else if (menu == 3){
		change = 10000 - (int)(tax*(how*ame));
		} else if (menu == 4){
		change = 10000 - (int)(tax*(how*fruit));
		}
		System.out.println(change);
	}
}