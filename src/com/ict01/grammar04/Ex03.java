package com.ict01.grammar04;
class Ex03 {
	public static void main(String[] args) {
	//���� for �� : for�� �ȿ� for���� ������.
	for (int i = 1 ; i < 4 ; i++ )
	{	
		for (int j = 1; j< 6 ; j++ )
		{
			System.out.println( "i = " + i + ", j = " +j);
		}
	}

	//������

	for (int i = 1; i < 10 ; i++ )
	{
		System.out.println(i + "��" );
		for (int j = 1; j<10 ; j++ )
		{
			System.out.print(i + "x" + j + " = " + (i*j) + " | ");
		}
	}
	System.out.println();
	System.out.println();
	for (int i = 1 ; i < 5 ; i++ )
	{
		for (int j = 1; j < 5 ; j++ )
		{ 
			System.out.print("0");
		}
		System.out.println();
	}

	System.out.println();
	System.out.println();
	
	for (int i = 1; i< 5 ; i++ )
	{
		for (int j=1; j< 5 ; j++  )
		{
			if (i==j)
			{
				
				System.out.print("1 ");
			} else {
				
				System.out.print("0 ");
			}
		}
		System.out.println();
	}
	}
}
