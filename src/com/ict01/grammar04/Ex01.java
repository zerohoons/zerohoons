package com.ict01.grammar04;
class Ex01{
	public static void main(String[] args){
		//switch ~ case �� : if���� ���� �б⹮(���ǿ� ���� ��������)
		//if���� ���ǽĿ� boolean��, �񱳿���, �������� ����ϴ� �ݸ�,
		//switch ~ case ���� byte, short, char, int, String �� ����Ѵ�.
		//if���� �������� ����� �� ������,switch ~ case ���� ����� �� ����.
		//�̷��� Ư¡���� switch ~ case ���� if�������� ��ȯ�� �����ϴ�.
		//������ ��� if���� ��� Ư¡�� ������Ŀ� ���� �ٸ���.
		//������ : switch(���ڰ� = char, int, String){
		//		case(���ǰ�1 = ���ڰ��� ���ǰ� 1�� ���� ��): => �����ݷ��� �ƴ� �ݷ��� ����Ѵ�.
		// 		���ڰ� == ���ǰ�1�϶� ������ ����; break;
		//		case(���ǰ�2):
		// 		���ڰ� == ���ǰ�2�϶� ������ ����; break;
		//		case(���ǰ�3):
		// 		���ڰ� == ���ǰ�3�϶� ������ ����; break;
		//		case(���ǰ�4):
		// 		���ڰ� == ���ǰ�4�϶� ������ ����; break;
		//		}
		//		*break �� = �ش� switch ~ case ���� ���������� ������ ��.
		// 		 break�� ���� ���, ��� ���๮�� ���� (break�� ����������)
		
		//char k1�� A�̸� ������ī, B�̸� �����, C�̸� ĳ����, ������ �ѱ�
		
		char k1 = 's';
		String ans =" ";
		switch (k1){
		case'A': case'a': ans = "������ī"; break;
		case'B': case'b': ans = "�����"; break;
		case'C': case'c': ans = "ĳ����"; break;
		default: ans = "���ѹα�"; break;
		}
		System.out.println("��� : " + ans);

		// int k2 �� 1�Ǵ� 3�̸� ���� 2�Ǵ� 4�̸� ����
		int k2 = 3;
		String str2 = " ";
		switch(k2){
		case 1: case 3: str2 = "����"; break;
		case 2: case 4: str2 = "����"; break;
		}
		System.out.println("��� : " + str2);


		// String k3�� �ѱ��̸� ����, �߱��̸�, ����¡, �Ϻ��̸� ����
		String k3 = "�ѱ�";
		String str3 = " ";
		switch(k3){
		case "�ѱ�": str3 = "����"; break;
		case "�Ϻ�": str3 = "����"; break;
		case "�߱�": str3 = "����¡"; break;
		}
		System.out.println("��� : " + str3);
	}	
}