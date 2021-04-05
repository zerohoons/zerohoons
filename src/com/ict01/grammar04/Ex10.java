package com.ict01.grammar04;
import java.util.Scanner;
class Ex10 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int count = 0;
		first:
		while(true){
			System.out.print("숫자입력 : ");
			int k = sc.nextInt();
			String msg = "";
			if (k%2==0)
			{
				msg = "짝수";
			}else{
				msg = "홀수";
			}
			System.out.println( k + "는 " + msg + "입니다.");
			
			while (true)
			{
			System.out.println( "계속할까요? (1. yes / 2. no) >>>>");
			int k2 = sc.nextInt();
			if (k2==1){
				continue first;
				//break;			
			} else if (k2 == 2){ break first;
			}else{ 
				count++;
				if (count == 10)
				{ break first;}
				continue; }
			//System.out.println("안쪽 while 문 끝");
			}	
		}
	}
}