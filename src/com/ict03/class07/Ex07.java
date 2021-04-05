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
				System.out.println("������ �մϴ�.");
			}
	
			@Override
			public void off() {
	
				System.out.println("������ ���ϴ�.");
				
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

//interface �� ��� �̺�Ʈ ó�� ���.
class Ex07 {
	public static void main(String[] args) {
		Radio radio = new Radio();
		radio.machinWork(new Remote()
			{	
				@Override
				public void on() {
					System.out.println("�ѱ�");
				}
				
				@Override
				public void off() {
					System.out.println("����");
				}
			}
		); 
		
	}
}
