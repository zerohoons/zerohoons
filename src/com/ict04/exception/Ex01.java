package com.ict04.exception;

public class Ex01 {
	public static void main(String[] args) {
		/* 일반적으로, 자바에서는 오류가 발생하면 프로그램을 강제로 종료시키는데,
		 * 예상된 오류나 가벼운 오류의 경우, 별도로 처리하는 방법을 사용하면
		 * 프로그램이 강제로 종료되는 것이 아닌, 정상 종료를 하게 된다. 이러한 방법을 예외처리라고 한다.*/
		
		//try ~ catch 문
		/*try{
		 * 예외가 발생 가능한 문장} catch(예상되는 예외 객체 변수명{
		 * 해당 예외가 발생시 수행할 문장. }
		 * 예외가 발생안할경우 지나감.
		 * 
		 * 다중 캐치문
		 * try{
		 * }catch(1){
		 * }catch(2){
		 * }catch(3){ }*/
		try {
		int [] ver = { 10, 20, 30};
		for (int i = 0; i <= ver.length; i++) {
			System.out.println(1);
			System.out.println(1);
			System.out.println("ver[" + i + "] = "+ver[i]);
			System.out.println(3);
			System.out.println(4);
		} } catch(Exception e) {

		}
		System.out.println("수고하셨습니다.");
	
	}
}
