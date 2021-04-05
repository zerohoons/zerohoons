package com.ict01.grammar02;
class Ex09{
	public static void main(String[] args){
	
	int sec = 23;
	int hour = 2;
	int min = 40;
	hour = hour*60;
	min =(min+hour)*60;
	sec = min +sec;
	System.out.println("2시간 40분 23초는 "+sec+" 초 이다.");

	sec = 9630 % 60; //초
	int min1 = 9630 / 60; //분(뭉틍그려서)
	min = min1 % 60; //분
	hour = min1 / 60; //시간
	System.out.println(hour+" 시간 "+min+" 분 "+sec+" 초");
	
	
	}
}	
// 2시간 40분 23초를 초단위로 변경해라.
	
	//9630초는 몇시간 몇분 몇초인가.