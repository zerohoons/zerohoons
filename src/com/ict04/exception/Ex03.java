package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		/* 다중 캐치문
		 * try{
		 * }catch(1){ 상위객체를 뒤에다가 씀. => exception 은 맨 뒤에 쓰는 걸로 기억해두자.
		 * }catch(2){
		 * }catch(3){ } */
		
		Scanner sc = new Scanner(System.in);
		try {
		
		int var = 27;
		System.out.println("정수 입력");
		
		int su = sc.nextInt();
		System.out.println("정답 : " + (var/su));
		
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없어요.");
		} catch (Exception e) {
			System.out.println("뭐가 불만이세요?" + e ); //e 를 출력하면 무슨 오류인지 알 수 있음.
		}
		//exception 만 입력할 경우 이는 가장 밑에 존재해야한다. 그 이외에는 크게 상관없음.
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("수고하셨습니다.");

	}
}
