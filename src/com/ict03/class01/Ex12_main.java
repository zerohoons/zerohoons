package com.ict03.class01;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		// 5���� �̸� , ����, ����, ���� ������ �޾Ƽ�
		// �̸�, ����, ���, ����, ������ ���ϰ� ��������
		
		//�Է¹޾Ƽ� �迭�� ����.
		Scanner sc = new Scanner(System.in);
		Ex12[] arr = new Ex12[5]; //Ŭ������ �����ϴ� �迭
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int kor = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			System.out.print("���� : ");
			int math = sc.nextInt();
			
			Ex12 person = new Ex12(name, kor, eng, math);
			
			arr[i] = person;
		}
		
		//���� ���ϱ�.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					continue;
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		
		// ����
		Ex12 tmp = new Ex12(); // �ڸ��� �����ϱ� ���� �ӽ�����
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "   ");
			System.out.print(arr[i].getSum() + "   ");
			System.out.print(arr[i].getAvg() + "   ");
			System.out.print(arr[i].getHak() + "   ");
			System.out.println(arr[i].getRank());
		}
	}
}
