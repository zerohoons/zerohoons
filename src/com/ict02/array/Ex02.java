package com.ict02.array;

public class Ex02 {
	public static void main(String[] args) {
		//배열 생성 순서 => 선언 -> 생성 -> 저장
		//선언과 생성을 한번에 하자.
		
		char[] c1 = new char[4];
		c1[0] = 'J';
		c1[1] = 'A';
		c1[2] = 'V';
		c1[3] = 'A';
		
		//c1[3] = 65; //char 크기 내라면 수를 넣어도 오류가 나지 않음.
		
		for(int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		
	//선언과 생성과 데이터 저장을 한번에.
		String [] msg = {"Java", "jsp","spring","android"};
		
		}
	}

