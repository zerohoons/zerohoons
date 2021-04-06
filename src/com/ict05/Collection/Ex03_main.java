package com.ict05.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 coffee = new Ex03();
		
		//setter를 이용해서 이름과 값을 정함
		coffee.setName("커피음료");
		coffee.setPrice(2500);
		
		//생성자를 이용해서 이름과 값을 정함.
		Ex03 cola = new Ex03("콜   라",1600);
		Ex03 juice = new Ex03("과일음료",2300);
		
		//객체들을 저장하고 관리하는 방법 : Array, Collection
		
		//1. Array
		Ex03[] arr = new Ex03[3]; //처음 지정한 배열 갯수 이상으로 추가 불가능
		arr[0] = coffee;
		arr[1] = cola;
		arr[2] = juice;
		
		//이름과 가격 꺼내기
		for (Ex03 k : arr) {
			System.out.print("이름 : "+k.getName()+" / ");
			System.out.println("가격 : "+k.getPrice());
		}
		System.out.println("====================");
		
		//2. Collection
			//선언
		HashSet<Ex03> h1 = new HashSet<Ex03>(); //class로 Collection 구성하기.
		
			//추가
		h1.add(coffee);
		h1.add(cola);
		h1.add(juice); 
			//이후 추가도 가능
		h1.add(new Ex03("이온음료", 1500));
		h1.add(new Ex03("우   유", 1000));
		
		//이름과 가격 꺼내기
		//방법 1) 개선된 for문
		for (Ex03 k : h1) {
			System.out.print("이름 : "+k.getName()+" / ");
			System.out.println("가격 : "+k.getPrice());
		}
		System.out.println("====================");
		//방법2) iterator 이용
		Iterator<Ex03> it = h1.iterator(); //클래스를 이용할 때는 클래스 명!
		while(it.hasNext()) {
			Ex03 ex03 = (Ex03)it.next();
			System.out.print("이름 : "+ex03.getName()+" / ");
			System.out.println("가격 : "+ex03.getPrice());
		}
		System.out.println("====================");
		//포함여부 : contains
		if(h1.contains(coffee)) {
			System.out.println("있다.");
		}else {
			System.out.println("없다.");
		}
		//갯수 : size
		System.out.println(h1.size());
		
		/*삭제 : remove(Object o), clear()
		 	-> Collection 안에 해당 객체가 있으면 삭제.*/
		
		//cola를 삭제해보자.
		if(h1.contains(cola)) {
			h1.remove(cola);
			System.out.println(cola.getName() + " 삭제");
		} else {
			System.out.println("이미 존재하지 않음.");
		}
		
		//ice를 삭제해보자.
		if(h1.contains("ice")) {
			h1.remove("ice");
			} else {
			System.out.println("이미 존재하지 않음.");
		}
		
		//비어있는지 확인 : isEmpty()
		if(h1.isEmpty()) {
			System.out.println("비어있다.");
		}else {
			System.out.println("비어있지 않다.");
		}
		
		//전체 삭제
		h1.clear();
		
		if(h1.isEmpty()) {
			System.out.println("비어있다.");
		}else {
			System.out.println("비어있지 않다.");
		}
		
		
	}
}
