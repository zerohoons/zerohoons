package com.ict05.Collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		//나라 정보를 받으면 해당 나라의 수도를 출력하는 프로그램
		
		//1. 나라의 수도를 가지고 있는 데이터
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("한국", "서울");
		map.put("대한민국", "서울");
		map.put("Korea", "서울");
		map.put("korea", "서울");
		map.put("미국", "워싱턴");
		map.put("중국", "북경");
		map.put("일본", "동경");
		map.put("태국", "방콕");
		map.put("캐나다", "오타와");
		
		Set<String> sets = map.keySet();
		
		Scanner scan = new Scanner(System.in);
		
		re:
		while(true) {
			System.out.print("나라이름 >>>>>>>>>");
			String msg = scan.next();
			if(sets.contains(msg)) {
				String result = map.get(msg);
				System.out.println(msg + " 의 수도는 " + result + " 입니다.");
			}else {
				System.out.println("데이터에 없는 나라입니다.");
			}
			while(true) {
				System.out.println("계속할까요? Y/N");
				String str = scan.next();
				if ( str.equalsIgnoreCase("y")) {
					continue re;
				} else if (str.equalsIgnoreCase("n")) {
					break re;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					continue;
				}
		}
		}
		System.out.println("수고하셨습니다.");
	}
}
