package com.ict01.grammar04;
class Ex08 
{	// break lable => lable이 지정한 블록을 탈출.
	//				  단순 for 문 일때는, break와 동일한 업무를 수행함.
	// continue lable 문 => lable이 지정한 블록의 증감식으로 이동.
	//						단순 for 문 일 경우, continue와 동일한 업무를 수행함.
	// lable 만드는 방법 => 원하는 반복문 위나, 앞에 'lable명:'을 기재.
	public static void main(String[] args) 
	{
		for (int i = 1; i <11 ; i++ )
		{
			if (i == 5)break;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("====================================");

		esc1:
			for (int i = 1; i <11 ; i++ )
		{
			if (i == 5)break esc1;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("====================================");
		for (int i = 1 ; i < 4 ; i++ )
		{
			for (int j =1 ;j < 6 ; j++ )
			{
				if (j==3)break;
				System.out.print(i + " , "+j + " ");
			}
		}
		System.out.println();
		System.out.println("====================================");
		esc2:
		for (int i = 1 ; i < 4 ; i++ )
		{
			for (int j =1 ;j < 6 ; j++ )
			{
				if (j==3)break esc2;
				System.out.print(i + " , "+j + " ");
			}
		}
		System.out.println();
		System.out.println("====================================");
		for (int i = 1; i <11 ; i++ )
		{
			if (i == 5)continue;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("====================================");

		esc1:
			for (int i = 1; i <11 ; i++ )
		{
			if (i == 5)continue esc1;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("====================================");
		for (int i = 1 ; i < 4 ; i++ )
		{
			for (int j =1 ;j < 6 ; j++ )
			{
				if (j==3)continue;
				System.out.print(i + " , "+j + " |");
			}
		}
		System.out.println();
		System.out.println("====================================");
		esc2:
		for (int i = 1 ; i < 4 ; i++ )
		{
			for (int j =1 ;j < 6 ; j++ )
			{
				if (j==3)continue esc2;
				System.out.print(i + " , "+j + " |");
			}
		}
	}
}
