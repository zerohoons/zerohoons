package com.ict02.array;

import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		//배열 => 같은 자료형의 데이터들을 한 곳에 모아둔 묶음.
		//		  반드시 같은 자료형만 가능
		//		  생성할 때, 크기를 지정해야한다. 지정한 크기는 변경 불가.
		//		  배열을 출력할 때 일반적으로 for 문을 사용한다.
		
		//배열 생성 순서.
		// 1. 선언 : 자료형 [] 이름; 또는 자료형 이름[];
		// 2. 생성 : 이름 = new 이름의 자료형 [배열크기=빈 방의 수];
		//					new => 메모리에 데이터를 저장할 공간을 만들라는 예약어.
		//			   		    => 다른 말로는 인스턴스, 객체생성, 객체화
		// 3. 저장 : 이름[방번호 = index = 위치값] = 데이터;
		//			 이 때, 데이터는 같거나 작은 자료형이어야한다.
		
		int[] su;
		su = new int [5]; // 선언한 자료형보다 삽입하는 자료형이 크면 데이터 저장 불가.
		su[0] = 123;
		su[1] = 456;
		su[2] = 789;
		su[3] = 101112; // 아무것도 넣지 않을 경우 값은 0

		// 배열을 호출하면 주소가 나온다.
		System.out.println(su);	
		System.out.println();
		for (int i = 0 ; i < su.length;i++) {
			System.out.print(su[i]+" ");
		}
		
	}
}
