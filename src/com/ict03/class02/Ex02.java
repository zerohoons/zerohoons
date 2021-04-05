package com.ict03.class02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		//날짜 관련 클래스 : 현재 사용하고 있는 컴퓨터 기준.
		/* Date 클래스
		 * Calendar 클래스 */
		
		//Date 클래스
		Date date = new Date();
		System.out.println(date); //KST == Korea Standard Time
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss EEE"); //데이터 순서를 정함
		System.out.println(dateFormat.format(date)); //입력
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yy.M.d hh:mm:ss EEE"); //데이터 순서를 정함
		System.out.println(dateFormat2.format(date)); //입력
		
		//년, 월, 일, 시, 분, 초, 요일 각각 구하기
		
		System.out.println(date.getYear()+ 1900 + "년도"); //Calendar.get((Calendar.Year) == 현재연도 - 1900으로 구해짐.
		System.out.println(date.getMonth()+ 1 + "월"); // 0 - 11 까지만 나옴
		System.out.println(date.getDate() + "일"); 
		System.out.println(date.getHours()+ "시"); 
		System.out.println(date.getMinutes()+ "분"); 
		System.out.println(date.getDay()); // 요일 ( 0 == 일요일 ~ 6 == 토요일) 
		
		System.out.println("========================================================================");
		
		/*Calendar 클래스
		 * 현재 날짜와 시간을 구할 때는 new 예약어를 사용하지 않고 객체를 생성
		 * YY,MM,DD,hh,mm,ss를 구할 때 Calendar.get(Calendar.상수)를 사용.*/
		
		System.out.println(Calendar.getInstance().get(Calendar.YEAR)+"년도");
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR)+"년도");
		System.out.println(now.get(Calendar.MONTH)+1+"월"); //Month가 0-11 까지 있음
		System.out.println(now.get(Calendar.DATE)+"일");
		System.out.println(now.get(Calendar.DAY_OF_WEEK)+"요일");
		
		//시간 ; 12시간제 24시간제
		System.out.println(now.get(Calendar.HOUR)+ "시"); //12시간제
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+ "시"); //24시간제
		
		//AM/PM 구하기
		int res = now.get(Calendar.AM_PM);
		if(res==0) {
			System.out.println("AM " + now.get(Calendar.HOUR));
		} else if (res==1) {
			System.out.println("PM " + now.get(Calendar.HOUR));
		}
		
		//요일 (1~7 일~토) Date의 경우 0~6이다.
		
		int res2 = now.get(Calendar.DAY_OF_WEEK);
		switch(res2) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
		}
		
	}
}
