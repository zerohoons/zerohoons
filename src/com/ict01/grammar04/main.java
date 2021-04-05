package com.ict01.grammar04;
import java.util.Scanner;
class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //세자리수 입력
		int B = sc.nextInt();
		int d =B/100;  //100의자리 
		int a =B%100; // 10, 1의 자리
		int c = a / 10; // 10의자리
		int b = a % 10; // 1의자리
		
		System.out.println(A*b);
		System.out.println(A*c);
		System.out.println(A*d);
		System.out.println(A*B);
		
	}
}
