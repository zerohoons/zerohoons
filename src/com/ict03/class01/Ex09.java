package com.ict03.class01;

public class Ex09 {
	private String name; //private니까 클래스 내에서 수정가능
	private int sum;
	private double avg;
	private String hak;
	
	//모든 메소드가 void 이다.
	//이름받기 -> stter 활용
	//총점구하기 -> 
	public void p_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	//평균구하기
	public void p_avg() {
		avg = ((int)((double)(sum / 3.0)*10))/10;
	}
	//학점구하기
		public void p_hak() {
			if(avg>=90) {
				hak = "A";
			}else if(avg>=80) {
				hak = "B";
			}else if(avg>=70) {
				hak = "C";
			}else {
				hak = "F";
			}
		}
	//but 순위와 정렬은 여기서 불가능!
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	private int rank = 1;
}
