package com.ict01.grammar04;
class Ex05 
{
	public static void main(String[] args) 
	{
		// 중첩 while 문 : while 문 안에 while 문 존재.
		
		// 구구단1

		int i = 1;
		
		while (i <= 9)
		{	
			System.out.println(i + " 단");
			int j = 1;
			while (j <= 9)
			{
				System.out.println(i+" x "+j+ " = "+ (i*j));
				j++;
			}
			i++;
		}
		System.out.println("Hello World!");
	}
}
