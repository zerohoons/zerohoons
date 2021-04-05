package com.ict03.class07;

interface Test{
	int data = 1000;
	void printData();
}
//상속 받아 사용.
class Test02 implements Test{
	public void printData() {
		System.out.println("data : "+data);
	};
}

//상속받지 않고 사용
class Test03{
	Test t = new Test(){
		public void printData() {
			System.out.println("data : "+data);
		}
	};
}

//상속받지 않고 메소드에 넣기
class Test04{
	public void play() {
		new Test() {
			
			@Override
			public void printData() {
				System.out.println("data : "+data);
			}
		}.printData();//클래스 끝
	}//메소드 끝
}

//상속받지 않고 메소드 인자에 넣기
class Test05{
	public void sound(Test test) {
		test.printData();
	}
}
public class Ex08 {
	public static void main(String[] args) {
		//상속받아 사용한 경우 호출법
		Test02 test = new Test02();
		test.printData();
		
		//상속받지 않은 경우 호출법
		Test03 test2 = new Test03();
		test2.t.printData(); //클래스호출.멤버.원하는 메소드
		
		//메소드 안에 있는 경우.
		Test04 test3 = new Test04();
		test3.play();
		
		//메소드 인자에 있는 경우. -> 이벤트 처리법
		Test05 test4 = new Test05();
		test4.sound(new Test() {
			
			@Override
			public void printData() {
				System.out.println("data : "+data);
			}
		});
	}
}
