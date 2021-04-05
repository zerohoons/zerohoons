package com.ict01.grammar04;
class Ex04 
{
	public static void main(String[] args) 
	{
		//while 문 for 문과 같은 반복문.
		//형식 1)											형식 2)
		// 초기식;											초기식;
		// while(조건식){									while(true){
		//	조건이 참일때 실행할 문장;							실행할 문장;
		//	증감식;												증감식;
		//	}												if(끝낼 조건){
		// **while문 끝을 만나면 조건식으로 이동하라.			실행할 문장; break;
		//0-15까지 출력하자.									} if (끝낼 조건) { 실행할 문장; break;}	}
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
		// 0 - 10 까지 짝수만 출력
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
		// 0 - 10 까지 홀수만 출력
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
		//0-50까지 7의 배수만 출력

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
		//5단 출력
		i = 0;
		while (i <= 9)
		{
			
				System.out.println("5 x " + i + " = " +(i*5) + " ");
				i++;
		}
		System.out.println();

		// 0000을 네줄

		i = 0;
		while (true)
		{
			if (i == 4) break;
			System.out.println("0 0 0 0");
			i++;
			
		}
		System.out.println();

		// 0-10까지 누적합

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

		// 홀수의 누적합과 짝수의 누적합을 각각 구하시오.
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
