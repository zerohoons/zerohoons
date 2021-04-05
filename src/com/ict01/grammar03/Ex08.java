package com.ict01.grammar03;
import java.util.Scanner;
class Ex08 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	//숫자를 받아서 홀수, 짝수를 구분하자.
	System.out.println("어떤 숫자요? ");
	int q1 = sc.nextInt();
	String ans1 = ((q1 % 2) == 1) ? "홀수입니다.": "짝수입니다.";
	System.out.println(ans1); 
	
	//국어, 영어, 수학을 받아서 점수의 평균이 60이상이며 각각 점수가 40을 넘을때 합격 아니면 불합격
	System.out.println("국어 점수 : ");
	int kor = sc.nextInt();
	System.out.println("영어 점수 : ");
	int eng = sc.nextInt();
	System.out.println("수학 점수 : ");
	int mat = sc.nextInt();
	
	Double ave = (kor+eng+mat)/3.0;
	String ans2 = (kor>= 40 && eng>= 40&& mat>= 40)? (ave >=60) ? "합격입니다." : "불합격입니다." : "불합격입니다.";
	System.out.println(ans2); 

	//알바시간을 입력받아서 8시간까지는 시간당 8720, 초과하면 1.5배 알바시간을 입력받고 시급을 계산하자.

	System.out.println("근무시간을 알려주세요.");
	double hour = sc.nextDouble();
	int pay = 8720;
	double ot = (hour > 8)? (hour - 8) : 0;
	int ans3 = (int)(pay*(hour - ot) + (ot*pay*1.5));
	System.out.println("총 "+ans3 + "원 입니다.");
	}
}