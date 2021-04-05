package com.ict03.class02;
/*
 * StringBuffer, StringBuilder
 */
public class Ex05 {
	public static void main(String[] args) {
		//StringBuffer, StringBuilder
		
		//String은 불변의 속성을 지니고 있어, 메모리에 새로운 영역을 차지해서 확장해나간다.
		String msg = "hello";
		System.out.println(msg);
		msg = msg + " java"; //String에 값을 추가하면 새로운 메모리. 기존 값의 경우 쓰래기메모리가 됨.
		//기존 msg 는 쓰래기 메모리로, 새로운 msg는 새로운 메모리를 차지한다.
		System.out.println(msg);
		
		//StringBuffer, StringBuilder를 이용할 경우, 추가된 값을 기존 메모리에 갱신시킴.
		//StringBuffer, StringBuilder가 가변의 속성을 지니고 있기 때문에 메모리 값을 갱신시킬 수 있는 것이다.
		
		StringBuffer sb = new StringBuffer("Wellcome");
		System.out.println(sb);
		
		//StringBuffer, StringBuilder에서는 내용을 추가할 때 append("문자열"); 을 이용함.
		sb.append(" JAVA");
		//현재 메모리 영역에서 추가한다.
		System.out.println(sb.toString());
	}
}
