package com.ict01.grammar04;
import java.util.Scanner;
class  Ex06
{
	public static void main(String[] args) 
	{
		// do ~ while 문; while 문과 같은 반복문이지만, 먼저 실행한 후 나중에 비교한다.
		// 형식)
		// 초기식;
		// do{
		//		실행내용
		//		증감식
		//	} while(조건식);

		//0-10까지 출력
		
		int i = 0;
			do
			{
			System.out.print(i + " ");
				i++;
			}
			while (i<11);
			System.out.println();

		//반복 횟수를 받아서 처리하기.
		Scanner sc = new Scanner(System.in);
			System.out.print("반복횟수 : ");
			int count = sc.nextInt();


		i = 0;
		do
		{
			System.out.print("Hello Java");
			i++;
		}
		while (i <= count);

		System.out.println();
	
		//반복횟수와 판별숫자를 받아서 홀수 짝수를 출력
		System.out.print("몇번할래 : ");
		count = sc.nextInt();
		i = 0;
		do
		{ System.out.println("어떤 숫자가 궁금해? ");
			int que = sc.nextInt();
			if ((que%2) == 0)
			{ System.out.println("짝수입니다.");
			}else{
				System.out.println("홀수입니다.");
			}
			i++;
		}
		while (i < count);
		System.out.println("끝났어요");


	}
}
