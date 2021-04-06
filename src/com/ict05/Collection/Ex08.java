package com.ict05.Collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		/*	Map : interface
		 *  -> Key 와 Value를 mapping 하는 구조로 이루어짐.
		 *  -> Key는 중복될 수 없다. -> 자동으로 덮어써지기 때문에 이전 값 다 날라감.
		 *  -> Key를 호출하면 Value가 나온다.
		 *  -> Key를 set Collection에 별도로 보관한다.
		 *  
		 *  주요메소드
		 *  add()로 추가, 삽입을 할 수 없음.
		 *  삽입 : put(K key, V value)
		 *  key를 set에서 관리 : keySet()
		 *  containsKey(Object key) : boolean -> 인자로 받은 Key가 존재하면 true
		 *  containsValue(Object value) -> 인자로 받은 Value가 존재하면 true 
		 *  get(Object key) : 키를 받아서 Value값을 리턴
		 *  remove(Object key) : 키를 받아서 삭제
		 *  replace(K key, V value) : 치환*/
		
		//	Key를 순서있는 숫자로 만들면 for문 사용 가능.
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "한국");
		map1.put(2, "미국");
		map1.put(3, "중국");
		map1.put(4, "영국");
		map1.put(5, "태국");
		map1.put(6, "한국"); //Value값은 중복 가능.
		System.out.println(map1);
		
		map1.put(6, "일본");
		System.out.println(map1);
		
		//하나씩 추출하기.
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		System.out.println(map1.get(6));
		System.out.println();
		
		for (int i = 1; i <= map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		
		System.out.println();
		// 개선된 for문 사용 = keySet()을 이용해야한다.
		for (Integer s : map1.keySet()) { //keySet을 이용하지 않으면 사용불가!
			System.out.println(map1.get(s));
		}
		
		System.out.println();
		
		//itetator 사용해서 추출
		
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			int s1 = (int) it.next();
			System.out.println(map1.get(s1));
		}
		
		System.out.println("==============================");
		//	Key를 문자로 만들면 출력시 iterator를 사용해야한다.
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("이름","고길동");
		map2.put("나이", "34");
		map2.put("주소", "도봉구");
		map2.put("성별", "남");
		map2.put("취미", "잠자기");
		
		System.out.println("이름");
		System.out.println("나이");
		System.out.println("주소");
		System.out.println("성별");
		System.out.println("취미");
		System.out.println();
		
		//Key가 숫자가 아니면 출력하기가 번거롭고, 그렇기에 keySet()을 이용한다.
		for (String s : map2.keySet()) {
			System.out.println(map2.get(s));
		}
		System.out.println();
		
		Iterator<String> it2 = map2.keySet().iterator();
		while (it2.hasNext()) {
			String s = (String) it2.next();
			System.out.println(map2.get(s));
		}
	}
}
