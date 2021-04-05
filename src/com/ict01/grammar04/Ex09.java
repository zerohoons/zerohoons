package com.ict01.grammar04;
import java.util.Scanner;
class Ex09
{
	public static void main(String[] args) 
	{
		
		//1-10까지 짝수만 출력 (continue 사용)
		for (int i = 1;i<11 ;i++ )
		{
			if (i %2==1) continue;
				System.out.println(i);
		}
		//무한루프에서 숫자를 받아서 짝수, 홀수를 판별
		Scanner sc = new Scanner(System.in);
		//for 문 무한루프 = for ( ; ; ){ }
		
		while (true)
		{
			System.out.print("숫자를 입력하세요 : ");
			int A = sc.nextInt();
			String msg = "";
			if (A == 0)
			{ 
				msg = "0입니다.";
			}else
				{if (A%2 == 0)
			{
				msg = "짝수";
			}else{ msg = "홀수";}
			}
			System.out.println (msg + "입니다.");
			System.out.println ("계속할까요? ( 1. yes / 2. no ) >>>>>");

			int con = sc.nextInt();
			if (con ==2 )break;

					}
		System.out.println("종료");

	}
}
