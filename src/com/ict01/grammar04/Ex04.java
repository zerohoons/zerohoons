package com.ict01.grammar04;
class Ex04 
{
	public static void main(String[] args) 
	{
		//while �� for ���� ���� �ݺ���.
		//���� 1)											���� 2)
		// �ʱ��;											�ʱ��;
		// while(���ǽ�){									while(true){
		//	������ ���϶� ������ ����;							������ ����;
		//	������;												������;
		//	}												if(���� ����){
		// **while�� ���� ������ ���ǽ����� �̵��϶�.			������ ����; break;
		//0-15���� �������.									} if (���� ����) { ������ ����; break;}	}
		int i = 0;
		while (i<=15)
		{
			System.out.print(i + " ");
			i++;
		}
		System.out.println();

		i = 0;
		while (true)
		{
			
			if (i>=16)  break;
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		// 0 - 10 ���� ¦���� ���
		i = 0;
		while (i <= 10)
		{
			if ((i % 2) == 0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		// 0 - 10 ���� Ȧ���� ���
		i = 0;
		while (i <= 10)
		{
			if ((i % 2) == 1)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		//0-50���� 7�� ����� ���

		i = 0;
		while (i <= 50)
		{
			if ((i % 7) == 0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		//5�� ���
		i = 0;
		while (i <= 9)
		{
			
				System.out.println("5 x " + i + " = " +(i*5) + " ");
				i++;
		}
		System.out.println();

		// 0000�� ����

		i = 0;
		while (true)
		{
			if (i == 4) break;
			System.out.println("0 0 0 0");
			i++;
			
		}
		System.out.println();

		// 0-10���� ������

		i = 0;
		int sum = 0;

		while (true)
		{
			if(i==11) break;
			sum = sum + i;
			i++;
		}
		System.out.print(sum);
		System.out.println();

		// Ȧ���� �����հ� ¦���� �������� ���� ���Ͻÿ�.
		i = 0;
		sum = 0;
		int sum2 = 0;
		while (true)
		{
			if ((i%2)==1)
			{
				sum = sum +i;
			}else{
					sum2 = sum2 +i;
				}

			if (i==10) break;
			i++;

		}
		System.out.println(sum);
		System.out.println(sum2);

	}
}
