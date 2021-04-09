package com.ict07.IO;

import java.io.Serializable;
// ����ȭ = write / ������ȭ = read
// ��ü ����ȭ�� ������ȭ�� ���ؼ��� Serializable �Ǵ� Externalizable �� ��ӹ޾ƾ��Ѵ�.
// ��, ���� �տ� transient ���� ����ϸ� ����ȭ ��󿡼� ���ܵȴ�. 
//		-> �� ���, ���ܵ� ������ �����ʹ� �⺻ ���� ���ϰ� �ȴ�. ( int�� 0, double�� 0.0, boolean �� false)
public class Ex23_VO implements Serializable {
	/* Serializable �� ��ӹ޾� �ش� Ŭ������ ��ü�� ���� ���, class �ȿ� �ִ� ��� ���(����)���� ����ȭ ����� �ȴ�. */
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
