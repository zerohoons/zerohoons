package com.ict03.class01;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		//5명의 이름, 국어 영어, 수학 점수를 받아서 
		//이름, 총점, 평균 학점 순위를 구하고 정렬하자.
		Ex09[] arr = new Ex09[5];
		Scanner sc = new Scanner(System.in);
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요.");
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			
			Ex09 person = new Ex09();
			person.setName(name);
			person.p_sum(kor, eng, math);
			person.p_avg();
			person.p_hak();
			
			arr[i] = person;
			
		}
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr.length; j++) { 
			if(arr[i].getSum()<arr[j].getSum())
				arr[i].setRank(arr[i].getRank()+1);
			}
		}
		Ex09 temp = new Ex09();
		for (int i = 0; i < arr.length - 1; i++) { //-1을 하는 이유 : 마지막 건 비교할 필요 없음.
			for (int j = i+1; j < arr.length; j++) { // j = i+1/ i가 같지만 i+1이 계산값이 더 적음.
				if(arr[i].getRank() > arr[j].getRank()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
							
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + " / ");
			System.out.print(arr[i].getSum() + " / ");
			System.out.print(arr[i].getAvg() + " / ");
			System.out.print(arr[i].getHak() + " / ");
			System.out.print(arr[i].getRank());
			System.out.println();
		}
	}
}
