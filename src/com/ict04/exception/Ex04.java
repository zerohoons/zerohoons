package com.ict04.exception;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		/* finally : 예외가 발생하든 발생하지 않든 반드시 실행해야하는 문장을 처리할 때 사용.
		 * try { } catch( ){ } 뒤에 위치한다.
		   finally { 실행할 문장 }의 형식을 띄고 있다.*/
		
		Scanner sc = new Scanner(System.in);
		try {
		
		int var = 27;
		System.out.println("정수 입력");
		
		int su = sc.nextInt();
		System.out.println("정답 : " + (var/su));
		//return;
		}  catch (Exception e) {
			System.out.println("뭐가 불만이세요? " + e ); 
			return;
		} finally {
			System.out.println("반드시 수행해야할 문장."); 
		}
		System.out.println("수고하셨습니다.");
	}
}
