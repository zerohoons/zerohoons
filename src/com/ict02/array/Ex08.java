package com.ict02.array;

public class Ex08 {
	public static void main(String[] args) {
		//������ �迭 �� ��������
		//1���� �迭 �ȿ� �����ϴ� �迭�� ũ�Ⱑ ���� �ٸ�.
		// ���� -> ���� -> ������ ����
		
		char[][] ch1;
		ch1 = new char[3][]; //�迭 �� �迭�� ���̰� �ٸ��Ƿ� �տ��� ��!
		
		//�������� ������ �Է��� ��������ó�� �ϸ� �����߻�
//		ch1[0][1] = 'j';
//		ch1[0][2] = 'a';
//		ch1[0][3] = 'v';
//		ch1[0][4] = 'a';
//		ch1[1][1] = 'J';
//		ch1[1][2] = 'A';
//		ch1[1][3] = 'V';
//		ch1[1][4] = 'A';
//		ch1[2][1] = '��';
//		ch1[2][2] = '��';
//		ch1[2][3] = '��'; �Է½ÿ��� ������ �߻����� ������,
//		ch1[2][4] = '��'; ������ ���, ���� �߻�.
		
		//1���� �迭�� ���� ������ �迭�� �־��ֱ�.
		char [] c1 = {'j','a','v','a'};
		char [] c2 = {'J','S','P'};
		char [] c3 = {'A','n','d','r','o','i','d'};
		ch1[0] = c1;
		ch1[1] = c2;
		ch1[2] = c3;
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1[i].length; j++) {
				System.out.print(ch1[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("=======================");
	//����� ������ ������ ���� �ѹ���
	char[][] ch2 = {{'j','a','v','a'},{'��','��'},{'1','2','3'}};
	for (int i = 0; i < ch2.length; i++) {
		for (int j = 0; j < ch2[i].length; j++) {
			System.out.print(ch2[i][j]+ " ");
		}
		System.out.println();
	}
	}
	
}
