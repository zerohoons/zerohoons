package com.ict01.grammar04;
import java.util.Scanner;
class Ex09
{
	public static void main(String[] args) 
	{
		
		//1-10���� ¦���� ��� (continue ���)
		for (int i = 1;i<11 ;i++ )
		{
			if (i %2==1) continue;
				System.out.println(i);
		}
		//���ѷ������� ���ڸ� �޾Ƽ� ¦��, Ȧ���� �Ǻ�
		Scanner sc = new Scanner(System.in);
		//for �� ���ѷ��� = for ( ; ; ){ }
		
		while (true)
		{
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int A = sc.nextInt();
			String msg = "";
			if (A == 0)
			{ 
				msg = "0�Դϴ�.";
			}else
				{if (A%2 == 0)
			{
				msg = "¦��";
			}else{ msg = "Ȧ��";}
			}
			System.out.println (msg + "�Դϴ�.");
			System.out.println ("����ұ��? ( 1. yes / 2. no ) >>>>>");

			int con = sc.nextInt();
			if (con ==2 )break;

					}
		System.out.println("����");

	}
}
