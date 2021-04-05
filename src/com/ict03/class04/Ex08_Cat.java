package com.ict03.class04;

public class Ex08_Cat extends Ex06_Animal {
	
	@Override
	public void Sound() {
		System.out.println("³É³É");
		
	}

	@Override
	public void Eat(String food) {
		System.out.println("Ãò·ç");
	}

	@Override
	public String play() {
		return "Ä¹Å¸¿ö¿¡¼­ ³î±â";
	}

}
