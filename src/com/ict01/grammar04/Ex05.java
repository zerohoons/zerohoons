package com.ict01.grammar04;
class Ex05 
{
	public static void main(String[] args) 
	{
		// ��ø while �� : while �� �ȿ� while �� ����.
		
		// ������1

		int i = 1;
		
		while (i <= 9)
		{	
			System.out.println(i + " ��");
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
