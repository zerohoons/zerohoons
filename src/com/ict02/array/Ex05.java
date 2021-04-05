package com.ict02.array;

public class Ex05 {
	public static void main(String[] args) {
		String [] name = {"ȫ", "��", "��", "��", "��"};
		int[] kor = {80,90,80,70,100};
		int[] eng = {80,95,85,75,100};
		int[] math = {100,100,80,100,100};
		int[] rank = {1,1,1,1,1};
		
		
		//����, ���, ����
		int[] sum = new int [5];
		double[] ave = new double [5];
		String [] hak = new String [5];
		
		for (int i = 0; i < kor.length; i++) {
			sum[i] = kor[i]+eng[i]+math[i];
			ave[i] = sum[i]/3.0;
			ave[i] = (double)((int)(ave[i]*10))/10;
			
			if(ave[i] >= 90) {
				hak[i] = "A";
			}else if(ave[i] >= 80) {
				hak[i] = "B";
			}else if(ave[i] >= 70) {
				hak[i] = "C";
			}else {
				hak[i] = "F";
			}
			
		}
		
		//������ ������.
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if(sum[i]<sum[j]) {
					rank[i]++;
				}
			}
			
		}
		
		for (int i = 0; i < hak.length; i++) {
			System.out.print("�̸�\t"+ name[i]+"\t");
			System.out.print("����\t"+ sum[i]+"\t");
			System.out.print("���\t"+ave[i]+"\t");
			System.err.print("����\t"+hak[i]+"\t");
			System.err.println("����\t"+rank[i]+"\t");
			}	
	}
}
