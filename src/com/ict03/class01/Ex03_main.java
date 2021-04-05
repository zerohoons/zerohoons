package com.ict03.class01;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		//plus01 은 void이므로 받을 데이터가 없음.
		//test.plus01(); 호출하지 않으면 void가 실행이 되지 않기때문에
		//				  result의 값이 바뀌지 않음.
//		test.plus01();	//호출할 경우, void가 실행이되고 result가 void에서의 값을 갖고 
//						//돌아가기 때문에 값이 변경됨.
//		System.out.println(3);
//		System.out.println(test.result);
		
		//sub01 은 반환형이 int이므로 int형으로 저장변수를 만들자. 
		int sub = test.sub01();
		System.out.println(sub);
		
		test.plus01();	//호출할 경우, void가 실행이되고 result가 void에서의 값을 갖고 
		//돌아가기 때문에 값이 변경됨.
		System.out.println(test.result);
	}
}

