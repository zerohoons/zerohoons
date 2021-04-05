package com.ict02.array;

public class Ex09 {
	public static void main(String[] args) {
		int [][] persons = new int [5][5];
		
		int[] person1 = {1,270,90,'A',1};
		int[] person2 = {2,210,70,'C',1};
		int[] person3 = {3,180,60,'F',1};
		int[] person4 = {4,300,100,'A',1};
		int[] person5 = {5,285,95,'A',1};
		
		persons [0] = person1;
		persons [1] = person2;
		persons [2] = person3;
		persons [3] = person4;
		persons [4] = person5;
		
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if(persons[i][1]<persons[j][1]) {
					persons[i][4]++;
				}else if(i==j)continue;
			}
		}
		
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if(j==3) {
					System.out.print((char)(persons[i][j]) + " / " );	
					
				}else {
					System.out.print(persons[i][j] + " / " );	
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		//정렬
		//임시저장 배열
		
		int[] tmp = new int [5];
		
		for (int i = 0; i < tmp.length; i++) {
			for (int j = i+1; j < tmp.length; j++) {
				if(persons[i][4] > persons[j][4]) {
					tmp = persons[i];
					persons[i] =persons[j];
					persons[j] = tmp;
				} else if(i==j)continue;
			}
		}
		
		//출력
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons.length; j++) {
				if(j==3) {
					System.out.print((char)(persons[i][j]) + " / ");
				}else {
					System.out.print(persons[i][j]+" / ");
				}
			
			}System.out.println();
			
		}
//		String [] name = {"홍","이","김","박","임"};
//		int [] kor = {90, 80, 70, 85, 95};
//		int [] eng = {95, 85, 75, 85, 95};
//		int [] math = {90, 80, 80, 100, 100};
//		int [] sum = new int [5];
//		double [] ave = new double [5];
//		String [] point = new String [5];
//		int [] rank = {1,1,1,1,1};
//		for (int i = 0; i < name.length; i++) {
//			sum[i] = kor[i] + eng[i] + math[i];
//			ave[i] = sum[i]/3;
//			if (ave[i]>=90) {
//				point[i] = "A";
//			}else if(ave[i] >= 80) {
//				point[i] = "B";
//			}else if(ave[i] >= 70) {
//				point[i] = "C";
//			}else {
//				point[i] = "F";
//		}
//		}
//		for (int i = 0; i < point.length; i++) {
//
//			for (int j = 0; j < point.length; j++) {
//			if(ave[i]<ave[j]) {
//				rank[i]++;
//			}else if(ave[i]==ave[j])continue;
//			}
//		}
//		
	}
}
