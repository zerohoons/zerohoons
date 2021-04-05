package com.ict01.grammar02;
class Ex08{
	public static void main(String[] args){
	
	int money = 10000;
	int ame =2500;
	int hm =2;
	int total = ame*hm;
	int tax = (int)(total*0.1);
	
	int count = money-total-tax;
	System.out.println(count);
	
	}
}
//아메리카노 2500원 친구가 둘이서 10000원을 내고 두잔 주문했다.
	//잔돈은 얼마인가. (세금 10%가 추가된다.)
	
	
