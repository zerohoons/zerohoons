package com.ict01.grammar04;
class Ex07 
{
	public static void main(String[] args) 
	{	
		//break �� : ������ �ݺ����� Ż���� �� ���
		//continue �� : �ݺ������� ������ ������ ������ ��ŵ�ϰ� ����ȸ���� �Ѿ.
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
		//17�� ���� �ݺ��ȴ�.( while �̿��)
		while (k<21)
		{
			//if(k==17)continue;
			System.out.print( k+ " ");
			k++;
		}
	System.out.println();
		//��ø for ������ break ���
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
		i++; // while�� ��� continue �� �������� skip�Ǿ ���� �ݺ���Ʈ�� ��������.
		}
System.out.println("=========================");
			int i =1;
		while (i<4)
		{	//if(i==2)continue;
			for (int j = 1 ; j < 6 ; j++ )
			{
				System.out.println("i = " + i + ", j = " + j);
			}
		i++; // while�� ��� continue �� �������� skip�Ǿ ���� �ݺ���Ʈ�� ��������.
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
		i++; // while�� ��� continue �� �������� skip�Ǿ ���� �ݺ���Ʈ�� ��������.
		}

	}
}
