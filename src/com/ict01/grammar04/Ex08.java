package com.ict01.grammar04;
class Ex08 
{	// break lable => lable�� ������ ����� Ż��.
	//				  �ܼ� for �� �϶���, break�� ������ ������ ������.
	// continue lable �� => lable�� ������ ����� ���������� �̵�.
	//						�ܼ� for �� �� ���, continue�� ������ ������ ������.
	// lable ����� ��� => ���ϴ� �ݺ��� ����, �տ� 'lable��:'�� ����.
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
