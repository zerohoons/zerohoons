package com.ict01.grammar04;
class Ex07 
{
	public static void main(String[] args) 
	{	
		//break 문 : 현재의 반복문을 탈출할 때 사용
		//continue 문 : 반복문에서 이후의 수행할 문장을 스킵하고 다음회차로 넘어감.
		for (int i =1 ;i < 11 ; i++ )
		{
			if (i == 4)break;
			System.out.print(i + " ");

		}
		System.out.println();
		for (int i =1 ;i < 11 ; i++ )
		{
			if (i == 4)continue;
			System.out.print(i + " ");

		}
	System.out.println();
		int k = 0;
		while(k<21)
		{
			if(k==17) break;
			System.out.print( k+ " ");
			k++;
		}
			System.out.println();
		//17로 무한 반복된다.( while 이용시)
		while (k<21)
		{
			//if(k==17)continue;
			System.out.print( k+ " ");
			k++;
		}
	System.out.println();
		//중첩 for 문에서 break 사용
		for (int i = 1;i<4 ; i++ )
		{
			for (int j = 1 ; j < 6 ; j++ )
			{	if(j==3)continue;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println();
		for (int i = 1;i<4 ; i++ )
		{	if(i==2)continue;
			for (int j = 1 ; j < 6 ; j++ )
			{
				System.out.println("i = " + i + ", j = " + j);
			}
		i++; // while의 경우 continue 로 증감식이 skip되어서 무한 반복루트에 빠져버림.
		}
System.out.println("=========================");
			int i =1;
		while (i<4)
		{	//if(i==2)continue;
			for (int j = 1 ; j < 6 ; j++ )
			{
				System.out.println("i = " + i + ", j = " + j);
			}
		i++; // while의 경우 continue 로 증감식이 skip되어서 무한 반복루트에 빠져버림.
		}
		System.out.println("=========================");
		i =1;
		while (i<4)
		{	int j = 1;
			while(j < 6)
			{
				if(j==2)continue;
				System.out.println("i = " + i + ", j = " + j);
				j++;
			}
		i++; // while의 경우 continue 로 증감식이 skip되어서 무한 반복루트에 빠져버림.
		}

	}
}
