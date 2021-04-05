package com.ict02.array;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//이름 국어 영어 수학 입력 받아 총점 및 학점 및 순위 구하기
		Scanner sc = new Scanner(System.in);
		String [] name = new String [5];
		int [] kor = new int [5];
		int [] eng = new int [5];
		int [] math = new int [5];
		int [] sum = new int [5];
		double [] ave = new double [5];
		String [] rank = new String [5];
		int [] point = {1, 1, 1, 1, 1};
		
		
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("이름, 국어, 영어, 수학 입력 : ");
			name[i] = sc.next();
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
			math[i] = sc.nextInt();
		}
		for (int i = 0; i < sum.length; i++) {
			sum[i] = kor[i]+eng[i]+math[i];
			ave[i] = (double)(sum[i])/3;
			ave[i] = (double)((int)(ave[i]*10))/10;
			if (ave[i]>=90) {
				rank[i] = "A";
			}else if(ave[i] >= 80) {
				rank[i] = "B";
			}else if(ave[i] >= 70) {
				rank[i] = "C";
			}else {
				rank[i] = "F";
		}
		}
		for (int i = 0; i < point.length; i++) {

			for (int j = 0; j < point.length; j++) {
			if(ave[i]<ave[j]) {
				point[i]++;
			}else if(ave[i]==ave[j])continue;
			}
		}
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < name.length; i++) {
			System.out.println();
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(ave[i]+"\t");
			System.out.print(rank[i]+"\t");
			System.out.print(point[i]+"\t");
		}
		
	}
}
