package com.ict01.grammar04;
import java.util.Scanner;
class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); //���ڸ��� �Է�
		int B = sc.nextInt();
		int d =B/100;  //100���ڸ� 
		int a =B%100; // 10, 1�� �ڸ�
		int c = a / 10; // 10���ڸ�
		int b = a % 10; // 1���ڸ�
		
		System.out.println(A*b);
		System.out.println(A*c);
		System.out.println(A*d);
		System.out.println(A*B);
		
	}
}
