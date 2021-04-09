package com.ict07.IO;

import java.io.Serializable;

// �̸�, ����, ����, ����, ����, ���
public class Ex25_VO implements Serializable { //Serializable �Է� ���ϸ� ����ȭ �ȵ�.
	private String name;
	private	int kor;
	private	int eng;
	private	int math;
	private int sum;
	private	double avg;
	private String hak;
	
	public Ex25_VO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor+eng+math;
		this.avg = (double)((int)((sum*10)/3)/10.0);
		if(avg>=90) {
			this.hak = "A";
		}else if(avg>=80) {
			this.hak = "B";
		}else if(avg>=70) {
			this.hak = "C";
		}else {
			this.hak = "F";
		}
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public Ex25_VO() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
