package com.ict01.grammar04;
import java.util.Scanner;
class  Ex06
{
	public static void main(String[] args) 
	{
		// do ~ while ��; while ���� ���� �ݺ���������, ���� ������ �� ���߿� ���Ѵ�.
		// ����)
		// �ʱ��;
		// do{
		//		���೻��
		//		������
		//	} while(���ǽ�);

		//0-10���� ���
		
		int i = 0;
			do
			{
			System.out.print(i + " ");
				i++;
			}
			while (i<11);
			System.out.println();

		//�ݺ� Ƚ���� �޾Ƽ� ó���ϱ�.
		Scanner sc = new Scanner(System.in);
			System.out.print("�ݺ�Ƚ�� : ");
			int count = sc.nextInt();


		i = 0;
		do
		{
			System.out.print("Hello Java");
			i++;
		}
		while (i <= count);

		System.out.println();
	
		//�ݺ�Ƚ���� �Ǻ����ڸ� �޾Ƽ� Ȧ�� ¦���� ���
		System.out.print("����ҷ� : ");
		count = sc.nextInt();
		i = 0;
		do
		{ System.out.println("� ���ڰ� �ñ���? ");
			int que = sc.nextInt();
			if ((que%2) == 0)
			{ System.out.println("¦���Դϴ�.");
			}else{
				System.out.println("Ȧ���Դϴ�.");
			}
			i++;
		}
		while (i < count);
		System.out.println("�������");


	}
}
