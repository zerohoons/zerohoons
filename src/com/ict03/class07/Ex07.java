package com.ict03.class07;

interface Remote{
	void on();
	void off();
}

class Radio{
	public void radioworks(){
		
		Remote radio = new Remote() {
	
			@Override
			public void on() {
				System.out.println("라디오를 켭니다.");
			}
	
			@Override
			public void off() {
	
				System.out.println("라디오를 끕니다.");
				
			}
		
		};
		radio.on();
		radio.off();
	}
	public void machinWork(Remote remte) {
		remte.on();
		remte.off();
	}
}

//interface 의 경우 이벤트 처리 방식.
class Ex07 {
	public static void main(String[] args) {
		Radio radio = new Radio();
		radio.machinWork(new Remote()
			{	
				@Override
				public void on() {
					System.out.println("켜기");
				}
				
				@Override
				public void off() {
					System.out.println("끄기");
				}
			}
		); 
		
	}
}
