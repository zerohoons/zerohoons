package com.ict02.array;

import java.util.Iterator;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//5���� ��ȣ, ����, ����, ���� ������ �Է¹޾�
		//��ȣ, ����, ���, ����, ������ ���ϰ� ��������.
		int [][] clss = new int [5][5];
		int [] tmp = new int [5];
			for (int i = 0; i < clss.length; i++) {
			System.out.println("��ȣ, ����, ����, ���� ������ �Է��ϼ���.");
			int num = sc.nextInt();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			int sum = kor + eng + math;
			int ave = sum/3;
			char point = ' ';
			int level = 1;
				if (ave>=90) {
					point = 'A';
				}else if(ave >= 80) {
					point = 'B';
				}else if(ave >= 70) {
					point = 'C';
				}else {
					point = 'F'; }
//				
				//1���� �迭�� ����� ���Խ�Ű��.
//				int [] person = new int[5];
//				person[0] = num;
//				person[1] = sum;
//				person[2] = ave;
//				person[3] = point;
//				person[4] = level;
			//	
//				clss[i] = person;	
				
				// 2���� �迭�� �ٷ� �Է��ϴ� ���
				clss[i][0] = num;
				clss[i][1] = sum;
				clss[i][2] = ave;
				clss[i][3] = point;
				clss[i][4] = level;
		}
	
	for (int i = 0; i < tmp.length; i++) {
		for (int j = 0; j < tmp.length; j++) {
			if(clss[i][1] < clss [j][1]) {
				clss[i][4]++;
			}
		}
	}
	for (int i = 0; i < tmp.length; i++) {
		for (int j = i+1; j < tmp.length; j++) {
			if(clss[i][4]>clss[j][4]) {
				tmp = clss[i];
				clss[i]=clss[j];
				clss[j]=tmp;
			}
			
			}
	}
	
	System.out.println("��ȣ / ���� / ��� / ���� / ����");
	for (int i = 0; i < clss.length; i++) {
		for (int j = 0; j < clss[i].length; j++) {
			if(j==3) {
				System.out.print((char)(clss[i][3]) + " / ");
		}else {
			System.out.print(clss[i][j]+" / ");
		}
		}
		System.out.println();
		}
	

	}	
	}
