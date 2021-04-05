package com.ict01.grammar04;
class Ex02 {
	public static void main(String[] args) {
		
		// for 문 = 정해진 규칙에 따라 실행문을 반목 처리하는 문.
		// 형식 : for(초기식; 조건식; 증감식){
		//			조건식이 참일 때, 실행할 문장;
		//			조건식이 참일 때, 실행할 문장;
		//			}

		// for 문을 만나면 무조건 초기식으로 이동.
		// 초기식에서는 조건식으로 이동.
		// 조건식이 참이면 for문을 실행. 거짓이면 for 밖으로 빠져나간다.
		// for 문 실행 중 끝에 다다르면 무조건 증감식으로 이동.

		//안녕하세요 10번 출력하기.
		
		for (int i = 0 ; i<10 ;i++ )
		{
		System.out.println("안녕하세요. - "+ (i+1));
		}

		//0-15까지 출력하자.

		for( int i = 0; i<=15 ; i++) {
			System.out.print(i + " ");
		}
	System.out.println();
	System.out.println();
		// 0 - 10 까지 짝수만 출력
	for (int i = 1 ;i<= 10 ; i ++ )
	{ if ((i % 2 ) == 0)
	{ System.out.print(i + " "); }
	}
	System.out.println();
	System.out.println();
	// 0 - 10 까지 홀수만 출력
	for (int i = 1 ;i<= 10 ; i ++ )
	{ if ((i % 2 ) == 1)
	{ System.out.print(i + " "); }
	}
	System.out.println();
	System.out.println();
	
	//0-50까지 7의 배수만 출력
	 
	for ( int i = 0 ; i<=50 ; i++ )
	{	if ((i % 7) == 0)
	{
		System.out.print( i + " ");
	}
	}
	System.out.println();
	System.out.println();
	//5단 출력
		
	for (int i=1 ; i<=9 ; i++)
	{	System.out.println("5 * " + i + " = " + (5*i) + " ");
	}
	System.out.println();
	System.out.println();
	// 0000을 네줄
		
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
	// 0-10까지 누적합 구하기.
	int sum = 0;
	for (int i = 0 ; i < 11 ; i++)
	{ sum = sum + i; //i 의 누적합
	}
	System.out.println(sum);
System.out.println();
	System.out.println();
	// 홀수의 누적합과 짝수의 누적합을 각각 구하시오.
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