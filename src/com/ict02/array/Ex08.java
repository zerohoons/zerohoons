package com.ict02.array;

public class Ex08 {
	public static void main(String[] args) {
		//다차원 배열 중 가변길이
		//1차원 배열 안에 존재하는 배열의 크기가 각각 다름.
		// 선언 -> 생성 -> 데이터 저장
		
		char[][] ch1;
		ch1 = new char[3][]; //배열 안 배열의 길이가 다르므로 앞에만 씀!
		
		//가변길이 데이터 입력은 고정길이처럼 하면 오류발생
//		ch1[0][1] = 'j';
//		ch1[0][2] = 'a';
//		ch1[0][3] = 'v';
//		ch1[0][4] = 'a';
//		ch1[1][1] = 'J';
//		ch1[1][2] = 'A';
//		ch1[1][3] = 'V';
//		ch1[1][4] = 'A';
//		ch1[2][1] = '자';
//		ch1[2][2] = '바';
//		ch1[2][3] = '공'; 입력시에는 오류가 발생하지 않지만,
//		ch1[2][4] = '부'; 실행할 경우, 오류 발생.
		
		//1차원 배열을 만들어서 다차원 배열에 넣어주기.
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
	//선언과 생성과 데이터 저장 한번에
	char[][] ch2 = {{'j','a','v','a'},{'자','바'},{'1','2','3'}};
	for (int i = 0; i < ch2.length; i++) {
		for (int j = 0; j < ch2[i].length; j++) {
			System.out.print(ch2[i][j]+ " ");
		}
		System.out.println();
	}
	}
	
}
