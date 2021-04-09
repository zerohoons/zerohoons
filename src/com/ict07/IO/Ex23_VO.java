package com.ict07.IO;

import java.io.Serializable;
// 직렬화 = write / 역직렬화 = read
// 객체 직렬화나 역직렬화를 위해서는 Serializable 또는 Externalizable 을 상속받아야한다.
// 단, 변수 앞에 transient 예약어를 사용하면 직렬화 대상에서 제외된다. 
//		-> 이 경우, 제외된 변수의 데이터는 기본 값을 지니게 된다. ( int는 0, double은 0.0, boolean 은 false)
public class Ex23_VO implements Serializable {
	/* Serializable 을 상속받아 해당 클래스를 객체로 만들 경우, class 안에 있는 모든 멤버(정보)들이 직렬화 대상이 된다. */
	private String name;
	private transient int age;
	private	transient double weight;
	private boolean gender;
	
		

	public Ex23_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
