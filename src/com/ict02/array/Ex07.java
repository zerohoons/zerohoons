package com.ict02.array;

import java.util.Iterator;

public class Ex07 {
	public static void main(String[] args) {
		//다차원 배열 = 고정길이 + 가변길이 + 기본 
		//1) 고정길이 배열
		//	=> 선언 : 자료형 [][] 이름;
		//	=> 생성 : 이름 = new 자료형[1차원 배열의 수][배열안에 존재하는 배열의 수]
		//	=> 저장 : 이름[index][index] = 데이터; (고정길이만 사용)
		//
		//	*1차원 배열을 만들어서 다른 배열에 넣기(고정, 가변길이 모두 사용)
		
		int[][] k1;
		k1 = new int [2][4];
		
		k1[0][0] = 100;
		k1[0][1] = 200;
		k1[0][2] = 300;
		k1[0][3] = 400;

		k1[1][0] = 1000;
		k1[1][1] = 2000;
		k1[1][2] = 3000;
		k1[1][3] = 4000;
		
		System.out.println("k1 : "+k1);
		System.out.println("k1[0] : "+k1[0]);
		System.out.println("k1[0][0] : "+ k1[0][0]);
		
		//출력
		
		for (int i = 0; i < k1.length; i++) {
			for (int j = 0; j < k1[i].length; j++) {
				System.out.print(k1[i][j]+" ");
			}
			System.out.println();
		}
	System.out.println("=======================");
	//고정길이 선언과 생성을 한번에
	char [][]k2 = new char[3][2];
	
	k2 [0][0] = 'a';
	k2 [0][1] = 'A';
	k2 [1][0] = 'b';
	k2 [1][1] = 'B';
	k2 [2][0] = 'c';
	k2 [2][1] = 'C';
	
	for (int i = 0; i < k2.length; i++) {
		for (int j = 0; j < k2[i].length; j++) {
			System.out.print(k2[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("=======================");
	//선언부터 저장까지 한번에
	int [][] k3 = {{1,2,3,4},{10,20,30,40},{100,200,300,400}};
	for (int i = 0; i < k3.length; i++) {
		for (int j = 0; j < k3[i].length; j++) {
			System.out.print(k3[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println("=======================");
	// 1차원 배열을 만들어서 다차원 배열에 넣기. (고정길이, 가변길이 모두 사용 가능)
	char[][] k4 = new char [3][4];
	char[] s1 = {'j','a','v','a'};
	char[] s2 = {'자','바','공','부'};
	char[] s3 = {'1','2','3','4'};
	
	k4[0] = s1;
	k4[1] = s2;
	k4[2] = s3;
	
	for (int i = 0; i < k4.length; i++) {
		for (int j = 0; j < k4[i].length; j++) {
			System.out.print(k4[i][j]+" ");
		}
		System.out.println();
	}
}
}