package com.ict05.Collection;

//VO(ValueObject) : data�� �����ϴ� ��ü�� ����. 
//					getter�� ����� �� ������ ���� ������ �� ���� ���� �� �ִ�.

public class Ex03 {
	private String name;
	private int price;
	
	public Ex03() {}
	public Ex03(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
