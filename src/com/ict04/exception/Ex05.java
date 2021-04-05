package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		/*	throws : 예외를 처리하기 보다는, 발생할 예외객체를 양도하는 것.
		 * 	현재 메소드에서 예외처리를 하기 어려울 때, 현재 영역을 호출한 곳으로 값을 보내버리는 것.
		 * => 예외가 발생하면 예외를 처리하지 않고, 자신을 호출한 곳으로 예외객체를 전달하는 것.
		 * 	throws는 양도만 할 뿐 해결하는 것이 아니기 때문에 try~catch 문으로 해결을 해야한다. */
		
		Ex05 test = new Ex05();
		Scanner sc = new Scanner(System.in);
	try {
		System.out.println("정수입력 : ");
		String msg = sc.next();
		test.setData(msg);
		
	} catch (Exception e) {
		System.out.println("첫글자는 숫자로 입력하세요");
	}
	}	
		public void setData(String msg) throws NumberFormatException{
			// msg의 길이가 1 이상인 경우.
			if(msg.length()>=1) {
				String str = msg.substring(0,1);
				prnData(str);
			}
		}
		
		public void prnData(String str) throws NumberFormatException {
			int dan = Integer.parseInt(str);
			System.out.println(dan+"단");
			for (int i = 0; i < 10; i++) {
				System.out.println(dan + "*" + i + "="+ (dan*i));
			}
		}
}
