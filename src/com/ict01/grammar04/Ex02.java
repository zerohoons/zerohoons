package com.ict01.grammar04;
class Ex02 {
	public static void main(String[] args) {
		
		// for �� = ������ ��Ģ�� ���� ���๮�� �ݸ� ó���ϴ� ��.
		// ���� : for(�ʱ��; ���ǽ�; ������){
		//			���ǽ��� ���� ��, ������ ����;
		//			���ǽ��� ���� ��, ������ ����;
		//			}

		// for ���� ������ ������ �ʱ������ �̵�.
		// �ʱ�Ŀ����� ���ǽ����� �̵�.
		// ���ǽ��� ���̸� for���� ����. �����̸� for ������ ����������.
		// for �� ���� �� ���� �ٴٸ��� ������ ���������� �̵�.

		//�ȳ��ϼ��� 10�� ����ϱ�.
		
		for (int i = 0 ; i<10 ;i++ )
		{
		System.out.println("�ȳ��ϼ���. - "+ (i+1));
		}

		//0-15���� �������.

		for( int i = 0; i<=15 ; i++) {
			System.out.print(i + " ");
		}
	System.out.println();
	System.out.println();
		// 0 - 10 ���� ¦���� ���
	for (int i = 1 ;i<= 10 ; i ++ )
	{ if ((i % 2 ) == 0)
	{ System.out.print(i + " "); }
	}
	System.out.println();
	System.out.println();
	// 0 - 10 ���� Ȧ���� ���
	for (int i = 1 ;i<= 10 ; i ++ )
	{ if ((i % 2 ) == 1)
	{ System.out.print(i + " "); }
	}
	System.out.println();
	System.out.println();
	
	//0-50���� 7�� ����� ���
	 
	for ( int i = 0 ; i<=50 ; i++ )
	{	if ((i % 7) == 0)
	{
		System.out.print( i + " ");
	}
	}
	System.out.println();
	System.out.println();
	//5�� ���
		
	for (int i=1 ; i<=9 ; i++)
	{	System.out.println("5 * " + i + " = " + (5*i) + " ");
	}
	System.out.println();
	System.out.println();
	// 0000�� ����
		
		for (int i = 1 ; i <=4 ;i++ )
	{	System.out.println("0 0 0 0");
	}
	System.out.println();
	System.out.println();
		for (int i = 1 ; i <=4 ;i++ )
	{	for (int j = 0 ; j < 4 ; j++ )
	{ System.out.print("0 ");
	}
			System.out.println();
	}
	System.out.println();
	System.out.println();
	// 0-10���� ������ ���ϱ�.
	int sum = 0;
	for (int i = 0 ; i < 11 ; i++)
	{ sum = sum + i; //i �� ������
	}
	System.out.println(sum);
System.out.println();
	System.out.println();
	// Ȧ���� �����հ� ¦���� �������� ���� ���Ͻÿ�.
	int sum2 = 0;
	int sum3 = 0;
	for (int i = 0; i < 11 ; i++ ){
		if ((i % 2) == 0)
		{ sum2 = sum2 + i;
		}else{
			sum3 = sum3+i;
		}
	}
	System.out.print(sum2);
	System.out.println();
	System.out.println();
	System.out.print(sum3);

	System.out.println();
	System.out.println();
	//7!
	int sum4 = 1;
	for (int i =1 ; i < 8 ; i++ )
	{ sum4 = sum4 * i;
	System.out.println(sum4);
	}
	System.out.println(sum4);
}
}