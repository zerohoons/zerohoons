package com.ict03.class04;

public class Ex08_Cat extends Ex06_Animal {
	
	@Override
	public void Sound() {
		System.out.println("�ɳ�");
		
	}

	@Override
	public void Eat(String food) {
		System.out.println("���");
	}

	@Override
	public String play() {
		return "ĹŸ������ ���";
	}

}
